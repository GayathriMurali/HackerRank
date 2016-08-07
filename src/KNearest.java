import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KNearest {

	static ArrayList<point> getknearest(ArrayList<point> a,int k)
	{
	   PriorityQueue<point> pq = new PriorityQueue<point>(k, Collections.reverseOrder());
	   ArrayList<point> result = new ArrayList<point>();
	   for(int i=0;i<a.size();i++)
	   {
	         pq.offer(a.get(i));
		   if(pq.size()==k+1)
		   {
			   pq.poll();
					   
		   }
	   }
	   point nearest = pq.poll();
	   point farthest=null;
	   while(!pq.isEmpty())
	   {
		   farthest=pq.poll();
		   //result.add(pq.poll());
	   }
	   result.add(nearest);
	   result.add(farthest);
	   return result;
	}
	public static void main(String []args)
	{
		ArrayList<point> p = new ArrayList<point>();
		point a = new point(2,3); //sqrt(13)
		point b = new point(3,4); //sqrt(25)
		point c = new point(1,1); //sqrt(2)
		point d = new point(4,5); //sqrt(41)
		p.add(a);
		p.add(b);
		p.add(c);
		p.add(d);
		ArrayList<point> result = getknearest(p,2);
		for(point o : result)
			System.out.println(o.x+" "+o.y);
	}
}
class point implements Comparable<point>
{
	double x;
	double y;
	
	point(double a,double b)
	{
		x=a;
		y=b;
	}
	double distance()
	{
		double dist = (x*x+y*y);
		return dist;
	}
	public int compareTo(point p1)
	{
		return Double.compare(this.distance(),p1.distance());
		
	}
}

