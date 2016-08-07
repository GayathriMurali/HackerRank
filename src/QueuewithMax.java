import java.util.*;
public class QueuewithMax {
   int capacity;
   TrafficElement[] queue;
   QueueMax[] qm;
   int front=-1;
   int rear = -1;
   int front_max=-1;
   int rear_max=-1;
   QueuewithMax(int c)
   {
	   capacity=c;
	   queue=new TrafficElement[capacity];
	   qm=new QueueMax[capacity];
   }


   public void insert(TrafficElement n)
   {
	   if(front>capacity)
	   {
		   System.out.println("Queue overflow");
		   return;
	   }
	   queue[++front]=n;
	   if(front_max==-1)
		   qm[++front_max]=new QueueMax(n);
	   else
	   {
	       while(front_max>=0 && qm[front_max].data.volume<n.volume)
	       {
	           	   front_max--;
	       }
	       qm[++front_max]=new QueueMax(n);
	   }
	  if(rear==-1)
		  ++rear;
	  if(rear_max==-1)
		  ++rear_max;
	  
   }
   public TrafficElement remove()
   {
	   if(rear>=front)
	   {
		   System.out.println("Queue empty");
		   return null;
	   }
	   if(rear_max>=0 && qm[rear_max].data==queue[rear])
	   {
		   rear_max++;
	   }
	   return queue[rear++];
   }
   public TrafficElement max()
   {
	   if(rear_max>front_max)
	   {
		   System.out.println("Queue empty");
		   return null;
	   }
	   return qm[rear_max].data;
   }
   public static void main(String[] args)
   {
	   QueuewithMax q = new QueuewithMax(10);
	   List<TrafficElement> l = new LinkedList();
	   l.add(new TrafficElement(0,1.3));
	   l.add(new TrafficElement(1,0.0));
	   l.add(new TrafficElement(2,2.5));
	   l.add(new TrafficElement(3,3.7));
	   l.add(new TrafficElement(4,0.0));
	   l.add(new TrafficElement(5,1.4));
	   q.getmaxtimestamp(q,l,3);
	 /*  q.remove();
	   q.remove();
	   q.remove();
	   q.remove();
	   q.remove(); */
	   //System.out.println(q.max());
	   
	   
   }
   public void getmaxtimestamp(QueuewithMax q, List<TrafficElement> l,int w)
   {
	   List<TrafficElement> result = new LinkedList();
	   for(TrafficElement t:l)
	   {
		   q.insert(t);
		   while(t.timestamp-q.front>=w)
		   {
			   q.remove();
		   }
		   result.add(q.max());
       }
	   for(TrafficElement t : result)
	   {
		   System.out.println(t.volume);
	   }
   
}
}
class TrafficElement
{
	int timestamp;
	double volume;
	TrafficElement(int t,Double v)
	{
		timestamp=t;
		volume=v;
	}
}
class QueueMax
{
	TrafficElement data;
	QueueMax(TrafficElement d)
	{
		data=d;
	}
}
