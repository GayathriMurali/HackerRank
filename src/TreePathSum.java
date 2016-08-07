import java.util.HashMap;

public class TreePathSum {
	
	static int PathsToSum(Node root,int target,int runningsum,HashMap<Integer,Integer> pathcount) {
		if(root==null) return 0;
		runningsum += root.data;
		incrementHashTable(pathcount, runningsum, 1);
		int sum = target - runningsum;
		int paths = pathcount.containsKey(sum)?pathcount.get(sum) : 0;
		paths += PathsToSum(root.left,target,runningsum,pathcount);
		paths+= PathsToSum(root.right,target,runningsum,pathcount);
		incrementHashTable(pathcount, runningsum, -1);
		return paths;
		
	}
	static void incrementHashTable(HashMap<Integer, Integer> pathcount,int key,int delta)
	{
		if(!pathcount.containsKey(key)) pathcount.put(key, 0);
		pathcount.put(key,pathcount.get(key)+delta);
	}
	
	public static void main(String[] args)
	{
		int sum = 14;
        Node tree = new Node(10);
        tree.left = new Node(5);
        tree.right = new Node(-3);
        tree.left.left = new Node(3);
        tree.left.right = new Node(1);
        tree.right.right = new Node(11);
        tree.left.right.right=new Node(2);
        tree.left.left.right = new Node(-2);
        tree.left.left.left = new Node(3);
        HashMap<Integer,Integer> pathcount = new HashMap<Integer,Integer>();
        incrementHashTable(pathcount,0,1);
        int paths = PathsToSum(tree,8,0,pathcount);
        System.out.println("Number of paths : "+ paths);
	}

}
