import java.util.*;

//this can be disguised as
// 1. phone number to different strings
// 2 digits to char mapping type question
public class NumbertoString {
	
	public static void main(String []args)
	{
		HashMap<Integer,List<Character>> map = new HashMap<Integer,List<Character>>();
		List<Character> a = new ArrayList<Character>();
		a.add('a');
		a.add('b');
		a.add('c');
		map.put(1, a);
		List<Character> b = new ArrayList<Character>();
		b.add('d');
		b.add('e');
		b.add('f');
		map.put(2,b);
		List<Character> c = new ArrayList<Character>();
		c.add('g');
		c.add('h');
		c.add('i');
		map.put(3,c);
		List<Character> d = new ArrayList<Character>();
		d.add('j');
		d.add('k');
		d.add('l');
		map.put(4,d);
		ArrayList<String> result = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		String digits = "12";
		dfs(digits,map,0,sb,result);
		System.out.println(result.size());
		for(String s:result)
		{
			System.out.println(s);
		}
		
	}
	static void dfs(String digit,HashMap<Integer,List<Character>> map,int step,StringBuilder sb,ArrayList<String> result)
	{
		if(step==digit.length())
		{
			result.add(sb.toString());
			return;
		}
		Integer curr = Character.getNumericValue(digit.charAt(step));
		List<Character> s = map.get(curr);
		for(int i=0;i<s.size();i++)
		{
			sb.append(s.get(i));
			dfs(digit,map,step+1,sb,result);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
