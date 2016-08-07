
public class InttoString {

	static StringBuilder InttoString(int x)
	{
	   StringBuilder sb = new StringBuilder();
	   if(x * -1 > 0)
	   {
	      sb.append("-");
	      x = x * -1;
	   }
	   sb.append(x/10);
	   sb.append(x%10);
	   return sb;
	}

	static int StringtoInt(String x)
	{
	    char[] str = x.toCharArray();
	    boolean isnegative = false;
	    int number=0;
	    for(int i=0;i<str.length;i++)
	    {
	         if(str[i]=='-' && i==0) {
	            isnegative = true;
	            i++;
	         }
	         if(str[i] >= '0' && str[i]<='9') {
	                if(str[i]==0 && i <=1) continue;
	            	 number = number * 10 + str[i]-'0';     
	         }
	         else
	         {
	             
	              return Integer.MIN_VALUE;
	          }
	      }
	      if(isnegative)
	         return number * -1;
	      else
	         return number;
	    }
	    public static void main(String []args) {
	    	int num=-1234;
	    	String numstr="-01230";
	    	StringBuilder sb = InttoString(num);
	    	int no = StringtoInt(numstr);
	    	if(no == Integer.MIN_VALUE)
	    		 System.out.println("Invalid string");
	    	System.out.println(sb + "  " + no);
	    	
	    }
	}


