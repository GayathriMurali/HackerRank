public class FirstOccurance
{
   static int firstoccur(int[] a, int key)
   {
       int low =0;
       int high=a.length-1;
       while(low<=high)
       {
           int mid = (low+high)/2;
           if(a[mid]==key)
            {
                if(a[mid-1]!=key)
                    return mid;
                
            }
            if(key<=a[mid])
               high=mid-1;
             if(key > a[mid])
                low=mid+1;     
       }
       return -1;
   }
   public static void main(String []args)
   {
        int []a={-14,10,2,108,108,243,285,285,285,401};
        int index =firstoccur(a,108);
        if(index==-1)
           System.out.println("Key not found");
        else
           System.out.println(index);
           
   }
   
 }