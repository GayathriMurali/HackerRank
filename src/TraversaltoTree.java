import java.util.*;
public class TraversaltoTree {
	static int preindex=0;
	static Node constructtree(List<Integer> l1,List<Integer> l2,int start,int end)
	{
		if(l1.size()==0 || l2.size()==0)
			 return null;
		
		if(start > end)
			return null;
	       Node root = new Node(l2.get(preindex++));
	       if(start==end)
	    	   return root;
	       int index=search(l1,root.data,start,end);
	       if(index==-1)
	    	   return null;
	      
	       root.left=constructtree(l1,l2,start,index-1);
	       root.right=constructtree(l1,l2,index+1,end);
	       return root;
	}
	static int search(List<Integer> l1,int k,int start,int end)
	{
		int index=-1;
		for(int i =start;i<=end;i++)
		{
			if(l1.get(i)==k)
				index=i;
		}
		return index;
	}
	public static void main(String []args)
	{
		List<Integer> l1 = new LinkedList();
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(2);
		l1.add(7);
		l1.add(6);
 		l1.add(8);
 		List<Integer> l2 = new LinkedList();
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		Node root = constructtree(l1,l2,0,l1.size()-1);
		Inorder(root);
		
	}
	public static void Inorder(Node root)
	{
		if(root!=null)
		{
			Inorder(root.left);
			System.out.println(root.data);
			Inorder(root.right);
		}
	}

}
