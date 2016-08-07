import java.util.*;

//Working quick select. Use this as reference
public class KNearestinlineartime {
	 public static void main(String[] args)
	  {
	    List<Double> l = new ArrayList<Double>();
	  /*  point p = new point(2.0,3.0);
	    l.add(p.distance());
	    point p1= new point(3.0,4.0);
	    l.add(p1.distance());
	    point p2= new point(1.0,1.0);
	    l.add(p2.distance());
	    l.add(new point(4,5)); */
	    l.add(13.0);
	    l.add(0.0);
	    l.add(3.0);
	    l.add(31.0);
	    l.add(14.0);
	    l.add(11.0);
	    l.add(1.0);
	    l.add(4.0);
	    l.add(23.0);
	    getknearest(l,3);
	  }
	  public static void getknearest(List<Double> l,int k)
	  {
	    int pivot = pivothelper(l,k,0,l.size()-1);
	    //System.out.println(pivot);
	  //  if(pivot==k)
	   // {
	     for(int i=0;i<pivot;i++)
	      System.out.println(l.get(i));
	    //}

	    /*PriorityQueue<point> pq = new PriorityQueue<point>(k);
	    for(point p : l)
	    {
	      pq.offer(p);
	      if(pq.size()==k)
	      {
	          pq.poll();        
	      }
	    }
	    while(!pq.isEmpty())
	    {
	      point a=pq.poll();
	      System.out.println(a.x+" "+a.y);
	    }
	  
	   }*/
	}
	  private static int pivothelper(List<Double> l,int k,int low,int high)
	  {
	      int pivot=high;
	      int left=low;
	      int right=high;
	      while(true)
	      {
	        while(left<right && l.get(pivot) > l.get(left)) left++;
	        while(left<right && l.get(pivot)<= l.get(right)) right--;
	        if(left==right) break;
	        Double temp=l.get(left);
	        l.set(left,l.get(right));
	        l.set(right,temp);
	      }
	      
	      Double temp=l.get(pivot);
	      l.set(pivot,l.get(left));
	      l.set(left,temp);
	      if(k==left+1)
	    	  return k;
	      else
	      if(k<left+1)
	    	  return pivothelper(l,k,low,left-1);
	      else
	    	  return pivothelper(l,k,left+1,high);
	    //return high;
	  }
}
/*class PointClass implements Comparable<PointClass>
{
   int x;
   int y;
  PointClass(int a,int b)
  {
    x=a;
    y=b;
  }
  public double distance()
  {
     return x*x+y*y;
  }
  public int compareTo(PointClass o)
  {
      return Double.compare(o.distance(),this.distance());
  }
  
}*/
