import java.util.*;
public class ShortestSubArray {
	public static subarray shortest(Iterator<String> iter,List<String> query )
	{
		LinkedHashMap<String,Integer> dict = new LinkedHashMap<String,Integer>();
		for(String s:query)
			dict.put(s,null);
		int idx=0;
		int num=0;
		subarray result = new subarray(-1,-1);
		while(iter.hasNext())
		{
			String s = iter.next();
			if(dict.containsKey(s))
			{
				Integer n = dict.get(s);
				if(n==null)
					num++;
				dict.remove(s);
				dict.put(s, idx);
			}
			if(num==query.size())
			{
				if((result.start==-1 && result.end==-1) || (idx-getfirstentry(dict)<result.end-result.start))
				{
					result.start=getfirstentry(dict);
					result.end=idx;
				}
			}
			idx++;
		}
		
		
		return result;
	}
    public static int getfirstentry(LinkedHashMap<String,Integer> dict)
    {
    	Integer result = null;
    	for(Map.Entry<String, Integer> m: dict.entrySet())
    	{
    		result=m.getValue();
    		break;
    	}
    	return result.intValue();
    }
    public static void main(String[] args)
    {
    	List<String> master = new ArrayList();
    	master.add("a");
    	master.add("a");
    	master.add("c");
    	master.add("c");
    	master.add("b");
    	master.add("c");
    /*	master.add("apple");
    	master.add("banana");
    	master.add("apple");
    	master.add("apple");
    	master.add("dog");
    	master.add("cat");
    	master.add("apple");
    	master.add("dog");
    	master.add("banana");
    	master.add("apple");
    	master.add("cat");
    	master.add("dog"); */
    	List<String> query = new ArrayList();
    	query.add("a");
    	query.add("b");
    	query.add("c");
    	/*query.add("banana");
    	query.add("cat");*/
    	subarray result = shortest(master.iterator(),query);

    		System.out.println(result.start);
    		System.out.println(result.end);
    
    }
}
class subarray
{
	int start;
	int end;
	subarray(int i,int j)
	{
		start=i;
		end=j;
	}
}
