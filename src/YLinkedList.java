
public class YLinkedList {
      static LinkedListNode findnode(LinkedListNode n1,LinkedListNode n2)
      {
    	  if(n1==null || n2==null)
    		  return null;
    	  int l1 = length(n1);
    	  int l2=length(n2);
    	  int len = (l1>l2) ? l1-l2:l2-l1;
          return ((l1>l2)?findnodehelper(n1,n2,len):findnodehelper(n2,n1,len));
      }
      static LinkedListNode findnodehelper(LinkedListNode n1,LinkedListNode n2,int len)
      {
    	  int i =0;
    	  while(n1!=null && i<len)
    	  {
    		 	  n1=n1.next;
    			  i++;
    		 
    	  }
    	  while(n1!=null && n2!=null &&n1.data!=n2.data)
    	  {
    		  n1=n1.next;
    		  n2=n2.next;
    	  }
    	  return n1;
      }
      static int length(LinkedListNode n)
      {
    	  int len = 0;
    	  while(n!=null)
    	  {
    		  n=n.next;
    		  len++;
    	  }
    	  return len;
      }
      public static void main(String[] args)
      {
    	  LinkedListNode a = new LinkedListNode(3);
    	  a.next=new LinkedListNode(4);
    	  a.next.next=new LinkedListNode(5);
    	  a.next.next.next=new LinkedListNode(6);
    	  
    	  LinkedListNode b = new LinkedListNode(8);
    	  b.next=new LinkedListNode(9);
    	  b.next.next=new LinkedListNode(5);
    	  b.next.next.next = new LinkedListNode(6);
    	  //a.next.next.next=new LinkedListNode(6);
    	  LinkedListNode c = findnode(a,b);
    	  if(c!=null)
    	      System.out.println(c.data);
      }
}
