//time complexity o(number of nodes)
//space complexity o(depth)

public class TreeSymmetry {

	static boolean checksymmetry(Node left,Node right)
	{
		if(left==null && right==null)
			return true;
		if(left==null || right==null)
			return false;
		if(left.data==right.data && checksymmetry(left.left,right.right) &&
				checksymmetry(left.right,right.left))
			return true;
		return false;
	}
	static void makemirror(Node root)
	{
         if(root==null)
        	 return;
         else
         {
        	 Node temp = new Node();
        	 makemirror(root.left);
        	 makemirror(root.right);
        	 temp = root.left;
        	 root.left=root.right;
        	 root.right=temp;
         }
		
	}
	static void inorder(Node root)
	{
		if(root!=null)
		{
	     inorder(root.left);
	     System.out.println(root.data);
	     inorder(root.right);
		}
	}
	public static void main(String[] args)
	{
		Node root=new Node(2);
		root.left=new Node(3);
		root.right=new Node(6);
		
		root.left.left=new Node(4);
		root.left.right = new Node(5);
//		
//		root.right.left = new Node(4);
//		root.right.right= new Node(4);
		makemirror(root);
	    inorder(root);	
		boolean result = checksymmetry(root.left,root.right);
		if(result)
			System.out.println("Tree is symmetrical");
		else
			System.out.println("Tree is not symmetrical");
	}
}
