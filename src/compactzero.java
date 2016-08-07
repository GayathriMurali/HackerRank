
public class compactzero {
	
  public static void main(String []args)
	    {
	        int[] a = new int[]{0,0,0,0,0,0};
	        compact(a);
	    }
	    static void compact(int[] a)
	    {
	        int low = 0;
	        int high = a.length-1;
	        while(low<=high)
	        {
	            if(a[low]!=0 && a[high]==0)
	            {
	               low++;
	               high--;
	            }
	            else
	            if(a[low]==0 && a[high]!=0)
	              {
	                  int temp = a[low];
	                  a[low]=a[high];
	                  a[high]=temp;
	                  low++;
	                  high--;
	               }
	            else
	            if(a[low]!=0 && a[high]!=0)
	                 low++;
	            else
	            if(a[low]==0 && a[high]==0)
	                high--;
	        }
	        for(int i =0;i<a.length;i++)
	            System.out.println(a[i]);
	     }
	 }



