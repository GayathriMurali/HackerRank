import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dictword {
	static Map<String,String> memoized = new HashMap<String,String>();
	public static void main(String []args)
	{
	  
	  Set<String> dict= new HashSet<String>();
	  dict.add("bed");
	  dict.add("bath");
	  dict.add("and");
	  dict.add("beyond");
	  dict.add("bat");
	  dict.add("be");
	  dict.add("hand");
	  String str = "bedbathandbeyond";
	 // List<List<String>> l = new ArrayList();
	  StringBuilder result = new StringBuilder();
	  breakupwords(str,str.length(),dict,result);
	//   for(String s:l)
		//   System.out.println(s);
	}
    static void breakupwords(String input,int len,Set<String> dict,StringBuilder result)
    {
    	//int len = input.length();
    	//if(dict.contains(input)) l.add(input);
    	//if((memoized.containsKey(input))) l.add(input);
    	
    	for(int i =1;i<=len;i++)
    	{
    		String prefix=input.substring(0,i);
    		if(dict.contains(prefix))
    		{
    			//result.append(prefix+" ");
    			if(i==len)
    			{
    				result.append(prefix);
    				//memoized.put(input,prefix+" "+suffix);
    				System.out.println(result);
    				return;
    				
    				//return prefix+" "+suffix;
    			}
    			String suffix = input.substring(i,len);
    			breakupwords(suffix,len-i,dict,result);
    			
    			
    		}
    	}
    	//memoized.put(input,null);
    	//return null;
    }
}

