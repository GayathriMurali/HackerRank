
public class DiameterofTree {
	public static int getdiameter(Node root,height h)
	{
        height lh = new height();
        height rh = new height();
		if(root==null)
		{
			h.h=0;
			return 0;
		}
		lh.h++;
		rh.h++;
		int ldiameter=getdiameter(root.left,lh);
		int rdiameter=getdiameter(root.right,rh);
		h.h=Math.max(lh.h, rh.h)+1;
		return Math.max(lh.h+rh.h+1,Math.max(ldiameter, rdiameter));
		
	}
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.right.right = new Node(5);
		height h = new height();
		int r = getdiameter(root,h);
		System.out.println(r);
	}

}
class height
{
	int h;
}