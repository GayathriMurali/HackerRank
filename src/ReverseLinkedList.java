import java.util.LinkedList;

public class ReverseLinkedList {
    static void reverse(LinkedListNode node,int a,int b)
    {
    	if(node==null) return;
    	int len = length(node);
    	if(a>len || b>len) return;
    	int start=0;
         LinkedListNode prev=null;
         LinkedListNode curr=node;
         LinkedListNode next=null;
         while(start<a)
         {
        	 prev=curr;
        	 curr=curr.next;
        	 start++;
         }
         while(start<=b)
         {
        	  next=curr.next;
        	  curr.next=prev;
        	  prev=curr;
        	  curr=next;
        	  start++;
         }
        // node=prev;
   
         while(node!=null)
         {
        	 System.out.println(node.data);
        	 node=node.next;
        	 
         }
    	
    }
    public static void main(String []args)
    {
    	LinkedListNode node = new LinkedListNode<>(2);
    	node.next = new LinkedListNode(3);
    	node.next.next = new LinkedListNode(4);
    	node.next.next.next = new LinkedListNode(5);
    	node.next.next.next.next = new LinkedListNode(6);
    	node.next.next.next.next.next = new LinkedListNode(7);
    	reverse(node,2,5);
     }
    static int length(LinkedListNode node)
    {
    	int count =0;
    	while(node!=null)
    	{
    		node = node.next;
    		count++;
    	}
    	return count;
    }
}
