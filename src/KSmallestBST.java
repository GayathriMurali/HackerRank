import java.util.*;
public class KSmallestBST {
     static void ksmallest(Node root,int k, Deque<Node> dq)
     {
    
         if(root!=null && dq.size()<k)
         {
        	 ksmallest(root.left,k,dq);  // reverse left and right to find largest K in BST
        	 if(dq.size()<k)
        	    dq.addFirst(root);
        	 ksmallest(root.right,k,dq);
        	 
         }
     }
     public static void main(String[] args)
     {
    	 Deque<Node> dq = new LinkedList();
    	 Node root = new Node(5);
         root.left = new Node(3);
         root.right = new Node(6);
         
         root.left.left = new Node(2);
         root.left.right = new Node(4);
         root.left.left.left=new Node(1);
         //root.left.left.right=new Node(8);
        
         root.right.right = new Node(7);
         //root.right.right.left = new Node(9);
         //root.right.right.right = new Node(10);
         ksmallest(root,3,dq);
         //if(result!=null)
        	 System.out.println(dq.removeFirst().data);
         
     }
}
