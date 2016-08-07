import java.util.Stack;

public class Synczero {

	public static void main(String []args)
	{
		Node root = new Node(0);
		root.left = new Node(0);
		root.right = new Node(0);
		root.left.left = new Node(2);
		root.left.right = new Node(3);
		root.right.right = new Node(13);
		root.right.left = new Node(12);
		Stack<Integer> s = new Stack<Integer>();
		addleaf(root.left,s);
		addleaf(root.right,s);
		synczero(root,s);
		printtree(root);
	}
	static void synczero(Node root,Stack<Integer> s) {
		if(root.left==null || root.right==null) return;
		
		if(root.data==0)
		{
		   int temp = s.pop();
		   root.da
		}
		synczero(root.left);
		synczero(root.right);
	}
	static void addleaf(Node root,Stack<Integer> s)
	{
		if(root==null) return false;
        if(root.left==null) s.push(root.left.data);
        if(root.right==null) s.push(root.right.data);
        addleaf(root.left,s);
        addleaf(root.right,s);
	}
	static void printtree(Node root)
	{
		if(root==null) return;
		System.out.println(root.data);
		printtree(root.left);
		printtree(root.right);
	}
	
}
