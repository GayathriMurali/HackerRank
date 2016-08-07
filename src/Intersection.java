
public class Intersection {

	    static void findintersection(int[] a,int[] b)
	    {
	       int index1=0;
	       int index2=0;
	       int index3=0;
	       int[] result= new int[a.length];
	       if(a.length ==0 || b.length==0) {
	          System.out.println("");
	          return;
	       }
	       while(index1<a.length && index2<b.length)
	       {
	           if(a[index1]==b[index2])
	           {
	             if(index3==0)
	             {
	                result[index3]=a[index1];
	                index3++;
	              }
	              else
	              if(result[index3-1]!=a[index1])
	                 result[index3++]=a[index1];
	              index1++; 
	              index2++;
	           }
	           else
	           if(a[index1]<b[index2])
	                index1++;
	           else
	           if(a[index1] > b[index2])
	              index2++;
	       }
	       for(int i=0;i<index3;i++)
	          System.out.println(result[i]);
	    }
	    public static void main(String []args)
	    {
	    	int []a=new int[]{2,3,3,5,5,6,7,7,8,12};
	    	int []b=new int[]{5,5,6,8,8,9,10,10};
	    	findintersection(a,b);
	    }
	    }
	
