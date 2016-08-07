
public class MergeList {
	
	//Merge 2 linked list

	public static void main(String []args)
	{
	     LinkedListNode start = new LinkedListNode(2);
	     start.next = new LinkedListNode(5);
	     start.next.next = new LinkedListNode(10);
	     
	     LinkedListNode start1 = new LinkedListNode(6);
	     start1.next = new LinkedListNode(8);
	     start1.next.next = new LinkedListNode(11);
	     
	     Merge(start, start1);   
	}

	static void Merge(LinkedListNode s1,LinkedListNode s2)
	{
		LinkedListNode newlists = new LinkedListNode(0,null);
		LinkedListNode newlist = newlists;
	    if(s1==null) print(s2);
	    if(s2==null) print(s1);
	    if(s1==null && s2==null)
	       return;
	    while(s1!=null && s2!=null)
	    {
	        if(s1.data <= s2.data)
	        {
                
                 newlist.next= s1;
	               s1 = s1.next;
	        }
	        else
	        if(s2.data < s1.data)
	        {
	               newlist.next= s2;
	               s2= s2.next;
	           
	        }
	        newlist = newlist.next;
	       
	       }
	       if(s1!=null)
	       {
	           while(s1!=null) 
	           { 
	             newlist.next= s1;
	             s1 = s1.next;
	           }
	       }
	       if(s2!=null)
	       {
	          while(s2!=null) 
	           { 
	             newlist.next= s2;
	             s2 = s2.next;
	           }

	       }
	       print(newlists.next); 
	}
	static void print(LinkedListNode head)
	{
	   while(head!=null)
	   {
	      System.out.println(head.data);
	      head = head.next;
	    }
	}
}


