import java.util.Comparator;
import java.util.TreeMap;
class timeevent
{
	 public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	long timestamp;
	 String event;
	 timeevent(long t,String e)
	 {
		 timestamp=t;
		 event=e;
	 }
}
class Event {
	public static void main(String []args)
	{
	    TimeStamp ts = new TimeStamp();
	    timeevent t = new timeevent(910,"lunch");
	    timeevent t1 = new timeevent(1115,"lunch");
	    timeevent t2 = new timeevent(1230,"lunch");
	    timeevent t3 = new timeevent(630,"lunch");
	    timeevent t4 = new timeevent(845,"nap");
	    timeevent t5 = new timeevent(730,"bfast");
	    ts.put(t);
	    ts.put(t1);
	    ts.put(t2);
	    ts.put(t3);
	    ts.put(t4);
	    ts.put(t5);
	    timeevent result = ts.get(840);
	    System.out.println(result.event);
	}
}

class TimeStamp
{
   TreeNode root;
   public void put(timeevent t)
   {
	   if(root==null)
	   {
		   root = new TreeNode(t);
	   }
	   else
		   Insert(root,t);
   }
   private void Insert(TreeNode root,timeevent t)
   {
	   TreeNode node = new TreeNode(t);
	   TreeNode current = root;
	   TreeNode parent = null;
	   while(current!=null)
	   {
		   parent = current;
		   if(current.data.timestamp<t.timestamp)
			   current=current.right;
		   else
		   if(current.data.timestamp>t.timestamp)
			   current=current.left;
		}
	   if(parent.data.timestamp > t.timestamp)
	      parent.left=node;
	   else
		if(parent.data.timestamp < t.timestamp)
		   parent.right=node;
	   
   }
   public timeevent get(long timestamp)
   {
	   TreeNode n = getequalorclosest(root,timestamp,null);
	   return n.data;
   }
   private TreeNode getequalorclosest(TreeNode root,long key,TreeNode pre)
   {
	   if(root==null) return pre;
		if(root.data.timestamp==key)
		{
			return root;
		}
		if(key>root.data.timestamp)
		{
			return getequalorclosest(root.right,key,root);
		}
		if(key<root.data.timestamp)
		{
			return getequalorclosest(root.left, key,pre);
		}
		return pre;
   }

}

class TreeNode
{
	timeevent data;
	TreeNode left;
	TreeNode right;
	TreeNode(timeevent t)
	{
		data=t;
	    left=null;
		right=null;
	}
	TreeNode()
	{
		
	}
}





