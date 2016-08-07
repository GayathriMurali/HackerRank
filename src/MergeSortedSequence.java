import java.util.*;

public class MergeSortedSequence
	{ 
	     public static void merge(ArrayList<ArrayList<Integer>> seq)
	     {
	          PriorityQueue<list> pq = new PriorityQueue(10,new elementcomp());
	          ArrayList<Integer> head = new ArrayList<Integer>(seq.size());
	          for(int i=0;i<seq.size();i++)
	          {
	             if(seq.get(i).size() > 0)
	             {
	               pq.offer(new list(seq.get(i).get(0),i));
	               head.add(1);
	             }
	             else
	               head.add(0);
	           }
	           
	           ArrayList<Integer> result = new ArrayList<Integer>();
	           list headentry;
	           
	           while((headentry=pq.poll())!=null)
	           {
	               result.add(headentry.data);
	               if(head.get(headentry.index) < seq.get(headentry.index).size()){
	               pq.offer(new list(seq.get(headentry.index).get(head.get(headentry.index)),headentry.index));
	               head.set(headentry.index,head.get(headentry.index)+1);
	               }
	            }
	            for(Integer i:result)
	               System.out.println(i);
	                 
	           }
	     public static void main(String []args)
	     {
	    	 ArrayList<ArrayList<Integer>> seq = new ArrayList<ArrayList<Integer>>();
	    	 ArrayList<Integer> a = new ArrayList<Integer>();
	    	 a.add(3);
	    	 a.add(5);
	    	 a.add(7);
	    	 ArrayList<Integer> b = new ArrayList<Integer>();
	    	 b.add(0);
	    	 b.add(6);
	    	 ArrayList<Integer> c = new ArrayList<Integer>();
	    	 c.add(0);
	    	 c.add(6);
	    	 c.add(28);
	    	 seq.add(a);
	    	 seq.add(b);
	    	 seq.add(c);
	    	 merge(seq);
	     }
	}
	class list
	{
	   int data;
	   int index;
	   list(int d,int i)
	   {
	      data=d;
	      index=i;
	   }
	}
	class elementcomp implements Comparator<list>
	{
	    public int compare(list l1,list l2)
	    {
	        if(l1.data > l2.data) return 1;
	        else if(l1.data < l2.data) return -1;
	        else return 0;
	    }
	    
	}


