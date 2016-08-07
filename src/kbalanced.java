
public class kbalanced {

	static Nodeptr l;
	static Nodeptr r;
	static Nodeptr check_kbalanced(Node root, int k)
	{
		if(root==null) return new Nodeptr(root,0);
		l = check_kbalanced(root.left,k);
		if(l.n!=null)
			return l;
		r=check_kbalanced(root.right,k);
		if(r.n!=null)
			return r;
		
		int height = Math.abs(l.height-r.height);
		if(height >= k)
			return new Nodeptr(root,(l.height+r.height+1));
	    return new Nodeptr(null,(l.height+r.height+1));
	}
	
	public static void main(String[] args) {
		Node root = new Node(314);
		root.left = new Node(6);
		root.left.left = new Node(271);
		root.left.left.left = new Node(28);
		root.left.left.right = new Node(0);
		root.left.right = new Node(561);
		root.left.right.right = new Node(3);
		root.left.right.right.left=new Node(17);
		root.right = new Node(6);
		root.right.right = new Node(271);
		root.right.right.right=new Node(28);
		root.right.left = new Node(2);
		root.right.left.right=new Node(1);
		root.right.left.right.right=new Node(257);
		root.right.left.right.left=new Node(401);
		root.right.left.right.left.right=new Node(641);
		Nodeptr check=check_kbalanced(root,3);
		
		
	}
}
