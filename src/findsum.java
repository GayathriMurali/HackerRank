public class findsum {

    public static void main(String []args)
    {
         int a[] = {23,5,4,7,2,11};
         int sum = 20;
         boolean result = checksum(a,sum);
         if(result)
            System.out.println("Found sum");
         else
          System.out.println("Sum not found");
     }
     static boolean checksum(int[] a,int sum)
     {
          int found_so_far = 0;
          int start=0;
          
          for(int i=0;i<=a.length;i++)
          {
        	   if(sum==found_so_far)
               	return true;
        	   else
                if(found_so_far>sum)
                {
                	while(found_so_far>sum && start<=i)
                	{
                		found_so_far-=a[start];
                		start++;
                	}
                }
                else
                if(i<a.length)
                	found_so_far+=a[i];
           }
           return false;
      }
 }