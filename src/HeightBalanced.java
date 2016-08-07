class findHeight
{
	
   int CheckBalance(Node root)
   {
       if(root==null) return 0;
       else
       {
         int lh = CheckBalance(root.left);
         if(lh==-1) return -1;	 
         int rh=CheckBalance(root.right);
         if(rh==-1) return -1;
         int heightdiff=lh-rh;
         if(Math.abs(heightdiff) > 1) return -1;
         else return Math.max(lh,rh)+1;
       }
       
   }
}
public class HeightBalanced
{
   public static void main(String []args)
   {
	   findHeight fh = new findHeight();
       Node root = new Node(5);
       root.left=new Node(4);
      // root.right =new Node(6);
       root.left.left = new Node(3);
       root.left.left.left = new Node(7);
       //root.right.left = new Node(11);
       //root.right.right = new Node(15);
       int height = fh.CheckBalance(root);
       if(height == -1)
          System.out.println("Not balanced");
       else
         System.out.println("balanced");
   }
}