
public class MaxProduct {
   public static void main(String[] args)
   {
	   int[] a = new int[]{-3,-2,-1,-4,-5};
	   int result = findmaxproduct(a);
	   System.out.println(result);
   }
   static int findmaxproduct(int[] a){
	   int leastnonnegativeidx=-1;
	   int greatestnegativeidx=-1;
	   int leastnegativeidx=-1;
	   int numNegatives=0;
	   int product=1;
	   for(int i =0;i<a.length;i++)
	   {
		   if(a[i]<0)
		   {
			   numNegatives++;
			   if(leastnegativeidx==-1 || a[i]>a[leastnegativeidx])
				   leastnegativeidx=i;
			   if(greatestnegativeidx==-1 || a[i]<a[greatestnegativeidx])
				   greatestnegativeidx=i;
		   }
		   else
		   {
			   if(leastnonnegativeidx==-1 || a[i] < a[leastnonnegativeidx])
				   leastnonnegativeidx=i;
		   }
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   if(numNegatives==0 || (numNegatives%2==0 && leastnonnegativeidx!=-1))
		   {
			   if(i!=leastnonnegativeidx)
				   product*=a[i];
		   }
		   else
			if(numNegatives%2!=0)
			{
				if(i!=leastnegativeidx)
					product*=a[i];
			}
			else
			{
				if(i!=greatestnegativeidx)
					product*=a[i];
			}
	   }
	   return product;
	   
   }
}
