
public class LCA {
	static Node LCA(Node root,int a,int b)
	{
		if(!covers(root,a) || !covers(root,b))
			return null;
		return LCAHelper(root,a,b);
	}
	static Node LCAHelper(Node root,int a,int b)
	{
		if(root==null)
			return null;
		if(root.data==a)
			return new Node(a);
		if(root.data==b)
			return new Node(b);
		boolean aisLeft = covers(root.left,a);
		boolean bisLeft = covers(root.left,b);
		if(aisLeft!=bisLeft)
			return root;
		Node child = aisLeft?root.left:root.right;
		return LCAHelper(child,a,b);
	}
    static boolean covers(Node root,int n)
    {
    	if(root==null)
    		return false;
    	if(root.data==n)
    		return true;
    	return covers(root.left,n) || covers(root.right,n);
    }
	
	public static void main(String[] args)
	{
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
     
   //  Node a = new Node(4);
   //  Node b = new Node(3);
     Node result = LCA(root,7,8);
     System.out.println(result.data);
	}

}
