import java.util.*;
public class CombinationSum {
        public static List<ArrayList<Integer>> combinationsum(int[] candidates,int sum)
        {
        	List<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        	ArrayList<Integer> temp = new ArrayList<Integer>();
        	Arrays.sort(candidates);
        	if(candidates.length==0)
        		return l;
        	combinationsumhelper(candidates,sum,0,temp,l);
        	return l;
        	
        }
        public static void combinationsumhelper(int []candidates,int sum,int i,ArrayList<Integer>temp,List<ArrayList<Integer>> l)
        {
        	if(sum==0)
        	{
        		ArrayList<Integer>copy = new ArrayList<Integer>(temp);
        		l.add(copy);
        		return;
        	}
        	for(int j=i;j<candidates.length;j++)
        	{
        		if(sum<candidates[j])
        			return;
        		temp.add(candidates[j]);
        		combinationsumhelper(candidates,sum-candidates[j],j,temp,l);
        		temp.remove(temp.size()-1); 
        		
        	}
        	//temp.remove(temp.size()-1);
        }
        public static void main(String[] args)
        {
        	int[] candidates = new int[]{1,2,5,8,9};
        	List<ArrayList<Integer>> result = combinationsum(candidates,12);
        	Iterator<ArrayList<Integer>> it = result.iterator();
        	while(it.hasNext())
        	{
        		Iterator<Integer> i = it.next().iterator();
        		while(i.hasNext())
        			System.out.print(i.next() + " ");
        		System.out.println();
        	}
        	
        }
 }
