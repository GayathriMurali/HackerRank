
public class MaxProductSubArray {
   static int maxproduct(int[] a)
   {
	   int[] max=new int[a.length];
	   int[] min=new int[a.length];
	   int result = a[0];
	   max[0]=min[0]=a[0];
	   for(int i =1;i<a.length;i++)
	   {
		   if(a[i]>=0)
		   {
			   max[i]=Math.max(a[i],max[i-1]*a[i]);
			   min[i]=Math.min(a[i],min[i-1]*a[i]);
		   }
		   else
		   {
			   max[i]=Math.max(a[i],min[i-1]*a[i]);
			   min[i]=Math.min(a[i],max[i-1]*a[i]);
		   }
		   result=Math.max(result, max[i]);
	   }
	   return result;
   }
   public static void main(String[] args)
   {
	   int[] a =new int[]{0,0,0,1};
	   int r = maxproduct(a);
	   System.out.println(r);
   }
   
}
