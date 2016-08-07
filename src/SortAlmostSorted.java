// debug this

import java.util.*;
public class SortAlmostSorted {
	static void sort(List<Integer> l, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
		Iterator<Integer> it = l.iterator();
		for(int i=0;i<k && it.hasNext();i++)
			pq.offer(l.get(i));
		
		while(it.hasNext())
		{
			pq.offer(it.next());
			int smallest=pq.poll();
			System.out.println(smallest);
		}
		while(!pq.isEmpty())
		{
			int smallest = pq.poll();
			System.out.println(smallest);
		}
	}
	public static void main(String[] args)
	{
		List<Integer> l1 = new LinkedList();
		l1.add(3);
		l1.add(-1);
		l1.add(2);
		l1.add(6);
		l1.add(4);
		l1.add(5);
 		l1.add(8);
 		sort(l1,3);
	}

}
