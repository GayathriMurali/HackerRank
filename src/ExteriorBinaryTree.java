import java.util.*;
public class ExteriorBinaryTree {
     static List<Node> leftnodeandleaves(Node root,boolean isBoundary)
     {
    	 List<Node> result = new LinkedList();
    	 if(root!=null)
    	 {
    		 if(isBoundary || isLeaf(root))
    			 result.add(root);
    		 result.addAll(leftnodeandleaves(root.left,isBoundary));
    		 result.addAll(leftnodeandleaves(root.right, isBoundary && root.left==null));
    	 }
    	 return result;
     	
     }
     static boolean isLeaf(Node n)
     {
    	 return (n.left==null && n.right==null);
     }
     static List<Node> rightnodeandleaves(Node root,boolean isBoundary)
     {
    	 List<Node> result = new LinkedList();
    	 if(root!=null)
    	 {
    		 result.addAll(leftnodeandleaves(root.left,isBoundary && root.right==null));
    		 result.addAll(leftnodeandleaves(root.right, isBoundary));
    		 if(isBoundary || isLeaf(root))
    			 result.add(root);
    		     	 }
    	 return result;
     }
     public static void main(String[] args)
     {
    	 List<Node> exterior = new LinkedList();
    	 Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.left.left.left=new Node(7);
         root.left.left.right=new Node(8);
        
         root.right.right = new Node(6);
         root.right.right.left = new Node(9);
         root.right.right.right = new Node(10);
         exterior.add(root);
         exterior.addAll(leftnodeandleaves(root.left,true));
         exterior.addAll(rightnodeandleaves(root.right,true));
         for(int i=0;i<exterior.size();i++)
        	 System.out.println(exterior.get(i).data);
     }
}
