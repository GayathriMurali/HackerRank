import java.util.*;

import java.util.*;

public class StackWithMedian
{
     int sum =0;
     int median = 0;
     int num = 0;
     Stack<Integer> newest;
     Stack<Integer> oldest;
     PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
     PriorityQueue<Integer> maxheap = new PriorityQueue<>(100,new Comparator<Integer>() { @Override 
       public int compare(Integer s1,Integer s2)
       { 
         return Integer.compare(s2,s1);
       }
     }
  );
     
     StackWithMedian()
     {
         newest = new Stack();
         oldest = new Stack();
         
     }
     public void insert(int n)
     {
          newest.push(n);
          sum= sum + n;
          maxheap.offer(n);
          if(num%2==0)
          {
            if(minheap.size()==0)
            {
               num++;
               return;
            }
            else
            if(minheap.peek() < maxheap.peek())
            {
               int temp1 = minheap.poll();
              int temp2 = maxheap.poll();
              minheap.offer(temp2);
              maxheap.offer(temp1);
               
            }
          }
          else
          {
            minheap.offer(maxheap.poll());
          }
          num++;
          

     }
     private int getsize()
     {
       return newest.size() + oldest.size();
     }
     public int remove()
     {
        if(oldest.isEmpty())
        {   
          while(!newest.isEmpty())
            oldest.push(newest.pop());
        }
        return oldest.pop();
     }
  public int peek()
  {
      if(oldest.isEmpty())
        {   
          while(!newest.isEmpty())
            oldest.push(newest.peek());
        }
        return oldest.peek();
     
  }
  public int getmean()
  {
     int n = getsize();
      return sum/n;
  }
  public int getmedian()
  {
    if(num%2==0)
      return (minheap.peek()+maxheap.peek())/2;
   else
     return maxheap.peek();
  }
    public static void main(String[] args)
    {
        StackWithMedian s = new StackWithMedian();
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(5);
       s.insert(6);
      s.insert(7);
      System.out.println(s.getmean());
      System.out.println(s.getmedian());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.peek());
    }
}