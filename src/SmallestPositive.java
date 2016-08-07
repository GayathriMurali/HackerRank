
public class SmallestPositive {
   public static void main(String []args)
   {
	   int []a = new int[]{-1,-1,-1,-1,-1};
	   int result = findsmallest(a);
	   System.out.println(result);
   }
   static int findsmallest(int []a)
   {
	   int i=0;
	   while(i<a.length){
		   if(a[i]>0 && a[i]<=a.length-1 && a[a[i]-1]!=a[i])
		   {
			   swap(a,i,a[i]-1);
		   }
		   else
			   i++;
	   }
	   for(i=0;i<a.length;i++)
	   {
		   if(a[i]!=i+1)
			   return i+1;
	   }
	   return a.length+1;
	   
   }
   static void swap(int []a,int x,int y)
   {
	   int temp=a[x];
	   a[x]=a[y];
	   a[y]=temp;
   }
}
