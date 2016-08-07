import java.util.ArrayList;

public class PowerSet {
	static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> set)
	{
	    ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
	    int max= 1<<set.size();
	    for(int k=0;k<max;k++)
	    {
	    	ArrayList<Integer> singleset = getsubsets(k,set);
	        subsets.add(singleset);
	     }
	     return subsets;
	 }
	 
	 static ArrayList<Integer> getsubsets(int k,ArrayList<Integer> set)
	 {
	       ArrayList<Integer> subset = new ArrayList<Integer>();
	       int index=0;
	       for(int j=k;j>0;j>>=1)
	       {
	           if((j & 1)==1)
	              subset.add(set.get(index));
	        index++;
	       }
	       return subset;
	 }
	 public static void main(String []args) {
		 ArrayList<Integer> set = new ArrayList<Integer>();
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 set.add(4);
		 ArrayList<ArrayList<Integer>> allsets = subsets(set);
		 for(ArrayList<Integer> s: allsets)
		 {
			System.out.println(s);
		 }
		 
		 
	 }

}
