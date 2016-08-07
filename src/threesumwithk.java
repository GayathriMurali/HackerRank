import java.util.Arrays;

public class threesumwithk
{
   static void find3sum(int[] a,int k)
   {
      Arrays.sort(a);
      for(int i=a.length-1;i>=0;i--)
      {
          int l = 0;
          int r = i; 
          while(l<=r)
          {
              int sum = a[l]+a[r]+a[i];
              if(sum==k)
              {
                  System.out.println("Sum found at" + a[l] + " " + a[r] + " " + a[i]);
                  break;
              }
              if(sum < k)
              {
                 l++;
              }
              else
                r--;
            }
          }
      }
      public static void main(String []args)
      {
          int a[] = new int[]{-5,0,5,0};
          find3sum(a,0);
      }
 }

/*
 *  public static void main(String[] args) {
       List<Integer> l = new ArrayList<Integer>();
    l.add(0);
    l.add(5);
    l.add(-5);
     l.add(0);
   l.add(0);
    l.add(0);
    l.add(0); 
    findsum(l,-5);
    }
  public static void findsum(List<Integer> l,int k)
  {
    if(l.size()==0)
    {
      System.out.println("List empty");
      return;
    }
       Collections.sort(l); //O(nlogn)
    for(int i=l.size()-1;i>=0;i--)
    {
      int low =0;
      int high = i-1;
    while(low<=high)
    {
        int sum=l.get(low)+l.get(high)+l.get(i);
      if(sum==k)
      {
          System.out.println("Sum found at : "+l.get(low)+" "+l.get(high)+" "+l.get(i));
          break;
      }
      if(sum<k)
        low++;
      else
        high--;
    }
    }
  }

} */
