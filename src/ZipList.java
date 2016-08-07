
public class ZipList {
	
	static void ziplist(LinkedListNode head)
	{
		if(head==null || head.next==null)
			return;
		LinkedListNode firsthalfhead=head;
		LinkedListNode start = head;
		LinkedListNode mid = head;
        while(start!=null && start.next!=null)
        {
        	start=start.next.next;
        	mid=mid.next;
        }
		LinkedListNode start2=mid.next;
		start2=reverse(start2);
		mid.next=null;
		head=firsthalfhead;
		LinkedListNode Next1=null;
		LinkedListNode Next2=null;
		while(start2!=null)
		{
			Next1=firsthalfhead.next;
			Next2=start2.next;
			firsthalfhead.next=start2;
			start2.next = Next1;
			firsthalfhead=Next1;
			start2=Next2;
		}
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
	}
	static int length(LinkedListNode head)
	{
		int len=0;
		LinkedListNode start=head;
		while(start!=null)
		{
			len++;
			start=start.next;
		}
		return len;
	}
	static LinkedListNode reverse(LinkedListNode node)
	{
		if (node == null || node.next == null) {  
            return node;  
        }  
     
        LinkedListNode remaining = reverse(node.next);  
        node.next.next = node;  
        node.next = null;  
       return remaining;  
	}
	public static void main(String[] args)
	{
		LinkedListNode n = new LinkedListNode(10);
        n.next = new LinkedListNode(15);
        n.next.next = new LinkedListNode(23);
        n.next.next.next = new LinkedListNode(45);
        n.next.next.next.next = new LinkedListNode(60);
        n.next.next.next.next.next = new LinkedListNode(120);
        n.next.next.next.next.next.next=null;
        ziplist(n);
	}

}
