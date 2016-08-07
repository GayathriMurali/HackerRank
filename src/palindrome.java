// time complexity o(n/2)
public class palindrome {
  static boolean checkpalin(String str)
  {
	  int start = 0;
	  int end = str.length()-1;
	  boolean oddflag=false;
	  while(start<=end)
	  {
		  if(str.charAt(start)==str.charAt(end))
		  {
			  start++;
			  end--;
		  }
		  else
		  if(str.charAt(start)!=str.charAt(end))
			  return false;
		  if(start==end)
			return true;	  
	  }
	  return false;
  }
  public static void main(String[] args)
  {
	  String str="abba abba";
	  boolean result = checkpalin(str);
	  if(result)
		  System.out.println("Palindrome");
	  else
		  System.out.println("Not Palindrome");
	  
  }
}
