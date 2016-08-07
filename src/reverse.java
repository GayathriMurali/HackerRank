
public class reverse  {

	    public static void main(String []args)
	    {
	           LinkedListNode n = new LinkedListNode(10);
	           n.next = new LinkedListNode(15);
	           n.next.next = new LinkedListNode(23);
	           n.next.next.next = new LinkedListNode(45);
	           n.next.next.next.next = null;
	           LinkedListNode reverse = reverselinkedlist(n);
	           while(reverse!=null)
	           {
	             System.out.println(reverse.data);
	             reverse=reverse.next;
	           }
	     }
	     static LinkedListNode reverselinkedlist(LinkedListNode node)
	     {
	     
	    	 if (node == null || node.next == null) {  
	             return node;  
	         }  
	      
	         LinkedListNode remaining = reverselinkedlist(node.next);  
	         node.next.next = node;  
	         node.next = null;  
	        return remaining;  

	  
	    }
	   
}
