import java.util.*;
public class LongestSubArrayWithUniqueentries {
	public static int longest(List<Integer> a)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int result=0;
		int start =0;
		for(int i=0;i<a.size();i++)
		{
			Integer dupidx=map.put(a.get(i),i);
			if(dupidx!=null)
			{
				if(dupidx>=start)
				{
					result=Math.max(result,i-start);
					start=dupidx+1;
				}
			}
             	
		}
		if(start==0)
			return a.size();
		return result;
	}
	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1); 
		int len = longest(a);
		System.out.println(len);
	}

}
