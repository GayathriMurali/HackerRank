import java.util.*;
public class TwoSumInterface {
	
	static SortedSet<Integer> set = new TreeSet();
	public static void main(String[] args)
	{
		TwoSumInterface ti = new TwoSumInterface();
		ti.insert(4);
		ti.insert(-1);
		ti.insert(0);
		ti.insert(2);
		ti.insert(6);
		ti.insert(12);
		ti.insert(-2);
		boolean result = ti.test(90);
		System.out.println(result);
	}
	static void insert(int n)
	{
		set.add(n);
	}
	static boolean test(int sum)
	{
		boolean found=false;
		int low=0;
		int high = set.size()-1;
	    while(!set.isEmpty())
	    {
	    	int s = set.first()+set.last();
	    	if(s==sum)
	    	{
	    		return true;
	    		
	    	}
	    	if(s>sum)
	    	{
	    		set.remove(set.last());
	    		high--;
	    	}
	    	if(s<sum)
	    	{
	    		set.remove(set.first());
	    		low++;
	    	}
	    }
		return found;
	}

}
