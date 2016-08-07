public class CheckBST
{
  static boolean checkifBST(Node root,int lower,int higher)
  {
      if(root==null)
         return true;
      if((root.data < lower) || (root.data>higher))
         return false;
      return checkifBST(root.left,lower,root.data) && checkifBST(root.right,root.data,higher);
   }
  static boolean efficient_checkbst(Node root, int last_val)
  {
	  if(root!=null)
	  {
		//  return true;
	   boolean leftvalid = efficient_checkbst(root.left,last_val);
	   if(!leftvalid || root.data < last_val)
		  return false;
	   last_val=root.data;
	   return efficient_checkbst(root.right,last_val);
	  }
	  return true;
  }

   public static void main(String []args)
   {
       Node root=new Node(5);
       root.left=new Node(9);
       root.right=new Node(6);
       boolean result = efficient_checkbst(root, Integer.MIN_VALUE);
     //  boolean result = checkifBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
       if(result)
          System.out.println("BST");
        else
         System.out.println("Not BST");
 
        
   }
}