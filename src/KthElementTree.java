// debug
// alternate method is to add to a stack until stack reaches size k and return top element
public class KthElementTree {
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
       Node result = kthnode(root,3);
       if(result!=null)
    	   System.out.println(result.data);   
       }
   public static Node kthnode(Node root,int k)
   {
	   Node iter=root;
	   int leftsize=0;
	   if(root==null)
		   return null;
	   while(iter!=null)
	   {
		   leftsize = (iter.left!=null)?iter.left:0;
		   if(leftsize+1 < k)
		   {
			   k=k-(leftsize+1);
			   iter = iter.right;
			  // leftsize=0;
		   }
		   else
			   if(k==(leftsize+1))
			   {
				   return iter;
			   }
			   else
			   {
				   iter = iter.left;
			   }
	   }
	   return iter;
   }

}
