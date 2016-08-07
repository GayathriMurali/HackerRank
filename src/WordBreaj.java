import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class WordBreaj {
	public static HashMap<String,String> memoized = new HashMap<String,String>();
	public static void main(String[] args)
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
	  List<String> l = new ArrayList();
	  StringBuilder result = new StringBuilder();
	  String s =breakupwords(str,dict,result);
	  // for(String s:l)
		   //System.out.println(s);
	}
	public static String breakupwords(String str, Set<String> dict,StringBuilder result)
	{
		if(dict.contains(str))
			result.append(str+" ");
		//if(memoized.containsKey(str))
			//result.append(memoized.get(str)+" ");
		for(int i=1;i<str.length();i++)
		{
			String prefix=str.substring(0,i);
					if(dict.contains(prefix))
					{
						
						String suffix=str.substring(i,str.length());
						String segment = breakupwords(suffix,dict,result);
						if(segment!=null)
						{
						  result.append(prefix+" ");
						 // System.out.println(result);
						}
						//memoized.put(str, result.toString());
						
					}
		}
		//memoized.put(str, null);
		//System.out.println(result);
		return result.toString();
	}
}
