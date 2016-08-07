
public class InorderPreSucc {
	
	public static void main(String[] args)
	{
		 Node root = new Node(8);
	       root.left=new Node(6);
	      root.right =new Node(10);
	     // root.right.left = new Node(9);
	       root.left.left = new Node(4);
	       root.left.right = new Node(7);
	       root.left.left.right = new Node(5);
	       Node pre = null;
	      // pre =InorderPredecessor(root,8,pre);
	       pre = ClosestInorderPredecessor(root, 9, pre);
	       //if(pre==null)
	    	//   pre = ClosestInorderPredecessor(root, 11, pre);
	       System.out.println(pre.data);
	}
	static Node InorderPredecessor(Node root,int key,Node pre)
	{
		if(root==null) return null;
		if(root.data==key)
		{
			if(root.left!=null)
			{
				Node temp = root.left;
				while(temp.right!=null)
					temp=temp.right;
				pre=temp;
			}
			return root;
		}
		if(key>root.data)
		{
			return InorderPredecessor(root.right, key,root);
		}
		if(key<root.data)
		{
			return InorderPredecessor(root.left, key,pre);
		}
		return null;
	}
	static Node ClosestInorderPredecessor(Node root,int key,Node pre)
	{
		if(root==null) return pre;
		if(root.data==key)
		{
			/*if(root.left!=null)
			{
				Node temp = root.left;
				while(temp.right!=null)
					temp=temp.right;
				pre=temp;
			}*/
			return root;
		}
		if(key>root.data)
		{
			return ClosestInorderPredecessor(root.right, key,root);
		}
		if(key<root.data)
		{
			return ClosestInorderPredecessor(root.left, key,pre);
		}
		return pre;
	}
}
