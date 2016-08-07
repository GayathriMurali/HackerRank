
public class MaxSumSubarray {
	
	static int maxsum(int[] a)
	{
         int max_ending_here=0;
         int max_so_far=0;
         for(int i =0;i<a.length;i++)
         {
        	 max_so_far+=a[i];
        	 if(max_so_far<=0)
        		 max_so_far=0;
        	 else
        	 if(max_so_far > max_ending_here)
        		 max_ending_here=max_so_far;
         }
         
         return max_so_far;
	}
	public static void main(String[] args)
	{
		int[] a = new int[]{-1,-2,9,8,0,1,2};
		int r = maxsum(a);
		System.out.println(r);
	}
}
