
public class PreOrderMorris {
	public static void preordermorris(Node root)
	{
		if(root==null)
			return;
		while(root!=null)
		{
			if(root.left==null)
			{
				System.out.println(root.data);
				root=root.right;
			}
			else
			{
				Node current=root.left;
				while(current.right!=null && current.right!=root)
					current=current.right;
				if(current.right==root)
				{
					current.right=null;
					root=root.right;
				}
				else
				{
					System.out.println(root.data);
					current.right=root;
					root=root.left;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.right.right = new Node(5);
		preordermorris(root);
	}

}
