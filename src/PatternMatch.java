import java.util.ArrayList;
import java.util.HashMap;

public class PatternMatch {
	static ArrayList<String> MatchPattern(String pattern, ArrayList<String> list)
	{
	        int index = 0;
	     ArrayList<String> final_list = new ArrayList<String>();
	    for(String s:list)
	    {
	        HashMap<Character, Character> map = new HashMap<Character, Character>();

	        if(s.length() != pattern.length()) continue;
	        for(int i=0;i<s.length();i++) {
	             
	         
	           if(!map.containsKey(pattern.charAt(index)))
	           {
	                 map.put(pattern.charAt(index),s.charAt(i));
	                  index++;
	            }
	            else
	             {
	               if(map.get(pattern.charAt(index))==s.charAt(i))
	               {
	                   index++;
	           
	                }
	               else
	                  break;
	             }
	             if(index==s.length())
	             {
	                final_list.add(s);
	                index=0;
	             }

	        }
	      }
	          return final_list;
	  }
	
	public static void main(String []args)
	{
		String pattern="122134";
		ArrayList<String> list = new ArrayList<String>();
		list.add("aba");
		list.add("aaa");
		list.add("bcb");
		list.add("google");
		list.add("abcd");
		ArrayList<String>final_list = MatchPattern(pattern,list);
		for(String s:final_list)
			System.out.println(s);
	}
}
