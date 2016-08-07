
public class LevelOrderTraversal {
	static void levelorder(Node root)
	{
		int h = height(root);
		for(int i=0;i<=h;i++)
			levelhelper(root,i);
	}
	static void levelhelper(Node root,int l)
	{
		if(root==null)
			return;
		if(l==0)
			System.out.println(root.data);
		else
		{
			levelhelper(root.left,l-1);
			levelhelper(root.right,l-1);
		}
	}
	static int height(Node root)
	{
		if(root==null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) +1;
	}
	public static void main(String[] args)
	{
		Node root=new Node(2);
		root.left=new Node(3);
		root.right=new Node(6);
		
		root.left.left=new Node(4);
		root.left.right = new Node(5);
        levelorder(root);
	}

}
