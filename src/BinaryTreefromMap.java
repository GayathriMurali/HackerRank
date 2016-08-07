import java.util.*;
public class BinaryTreefromMap {
	public static Node buildTree (List<relation> data) 
	{
		Node root=new Node();
		HashMap<Integer,List<relation>> map = new HashMap<Integer,List<relation>>();
		
		Iterator<relation> i = data.iterator();
		while(i.hasNext())
		{
			relation r = i.next();
			if(r._parent==-1)
			{
				root=new Node(r._child);
			}
			else
			{
				if(map.containsKey(r._parent))
				{
					map.get(r._parent).add(r);
					
				}
				else
				{
					List<relation> child = new LinkedList();
					child.add(r);
					map.put(r._parent,child);
				}
			}	
		}
		for(Map.Entry<Integer,List<relation>> m: map.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		Queue<Node> q = new LinkedList<Node>();
		if(root!=null)
		   q.add(root);
		while(!q.isEmpty())
		{
			Node x = q.poll();
			if(map.containsKey(x.data))
			{
				List<relation> l = map.get(x.data);
				
				for(relation r:l)
				{
					Node c=new Node(r._child);
					q.add(c);
					if(r._isLeft)
						x.left=c;
					else
						x.right=c;
				}
			}
		}
		return root;
	}
	public static void main(String[] args)
	{
		relation r = new relation(15,20,true);
		relation r1 = new relation(19,80,true);
		relation r2 = new relation(17,20,false);
		relation r3 = new relation(16,80,false);
		relation r4 = new relation(80,50,false);
		relation r5 = new relation(50,-1,false );
		relation r6 = new relation(20,50,true);
		List<relation> list = new LinkedList();
		list.add(r);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
		list.add(r6);
		Node root = buildTree(list);
		inorder(root);
	}
	static void inorder(Node root)
	{
		if(root!=null)
		{
	     inorder(root.left);
	     System.out.println(root.data);
	     inorder(root.right);
		}
	}
}

class relation
{
	public Integer _child; 
	public Integer _parent; 
	public boolean _isLeft; 
	relation(int p,int c,boolean i)
	{
		_child=p;
		_parent=c;
		_isLeft=i;
	}
}