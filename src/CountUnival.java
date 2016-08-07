//  2 approaches here. Both within comments and outside comments are correct approaches

public class CountUnival {
	static int count=0;
	public static void main(String[] args)
	{
		
		Node root = new Node(5);
	       root.left = new Node(1);
	       root.right = new Node(5);
	       
	       root.left.left = new Node(5);
	       root.right.right = new Node(5);
	       root.left.right=new Node(5);
	       boolean result = getunival(root);
	       if(result)
	       {
	    	   System.out.println("Unival tree");
	         
	       }
	       System.out.println("count is"+count);
	       /*root.left.left.left=new Node(7);
	       root.left.left.right=new Node(8);
	      
	       root.right.right = new Node(6);
	       root.right.right.left = new Node(9);
	       root.right.right.right = new Node(10);*/
	}
	public static boolean getunival(Node root)
	{
       return getunivalutil(root);
		
	}
	public static boolean getunivalutil(Node root)
	{
		if(root==null)
			return true;
		boolean lunival=getunivalutil(root.left);
		boolean runival=getunivalutil(root.right);
		/*if(lunival==false || runival==false)
			return false;
		if(root.left!=null && root.data!=root.left.data)
			return false;
		if(root.right!=null && root.right.data!=root.data)
			return false;
		count++;
		return true;*/
		if(lunival && runival)
		{
			if(root.left==null && root.right==null)
			{
				count++;
				return true;
			}
			if(root.left!=null && root.right!=null && root.data==root.right.data && root.data==root.left.data)
			{
				count++;
				return true;
				
			}
			if(root.left!=null && root.data==root.left.data)
			{
				count++;
				return true;
			}
			if(root.right!=null && root.right.data==root.data)
			{
				count++;
				return true;
			}
				
		}
		return false;
	}
	

}
