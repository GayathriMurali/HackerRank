

import java.util.*;
public class BinaryTreeLeaf {

	static List<Node> leaves = new LinkedList();
	   public static void leafnodes(Node root)
	   {
	       if(root!=null)
	       {
	    	   if(root.left==null && root.right==null)
	    		   leaves.add(root);
	    	   else
	    	   {
	    		   leafnodes(root.left);
	    		   leafnodes(root.right);
	    	   }
	       }
	   }
	    public static void print()
	    {
	      Iterator<Node> i = leaves.iterator();
	      while(i.hasNext())
	      {
	    	  Node n = i.next();
	         System.out.println(n.data);
	      }
	    }
	    public static void main(String[] args)
	    {
	       Node root = new Node(1);
	       root.left = new Node(2);
	       root.right = new Node(3);
	       
	       root.left.left = new Node(4);
	       root.left.right = new Node(5);
	      
	       root.right.right = new Node(6);
	       root.right.right.left = new Node(9);
	       root.right.right.right = new Node(10);
	       leafnodes(root);
	        print();
	    }

}

