
public class KthLastElement {

	static LinkedListNode kthnode(LinkedListNode l1,int k)
	{
		
	     LinkedListNode start=l1;
	     LinkedListNode runner=l1;
	     while(runner!=null)
	     {
	    	 start=start.next;
	    	 runner = movebyk(start,k);
	    	 
	     }
	     return start;
	}
	static LinkedListNode movebyk(LinkedListNode l1,int k)
	{
		while(k-- > 0)
			l1=l1.next;
		return l1;
	}
	public static void main(String[] args)
	{
		LinkedListNode a = new LinkedListNode(4);
		a.next = new LinkedListNode(5);
		a.next.next = new LinkedListNode(6);
		a.next.next.next = new LinkedListNode(7);
		a.next.next.next.next = new LinkedListNode(8);
		a.next.next.next.next.next = new LinkedListNode(9);
		LinkedListNode k =kthnode(a,3);
		if(k!=null)
			System.out.println(k.data);
	}
}
