import java.util.*;
public class WordLadder {
	
	public static int getpath(Set<String> D,String s,String t)
	{
		Queue<StrwithDistance> q = new LinkedList();
		q.add(new StrwithDistance(s,0));
	    StrwithDistance f;
	    while((f=q.poll())!=null)
	    {
	    	if(f.candidateString.equals(t))
	    		return f.distance;
	    	
	        String str = f.candidateString;
	        for(int i=0;i<str.length();i++)
	        {
	        	String strstart=i==0?"":str.substring(0, i);
	        	String strend=(i+1) < str.length()?str.substring(i+1):"";
	        	for(int j=0;j<26;j++)
	        	{
	        		String c = strstart+(char)('a'+j)+strend;
	        		if(D.remove(c))
	        			q.add(new StrwithDistance(c,f.distance+1));
	        	}
	        }
	    }
	    return -1;
	}
	public static void main(String[] args)
	{
		Set<String> s = new HashSet();
		s.add("bat");
		s.add("cot");
		s.add("dog");
		s.add("dag");
		s.add("dot");
		s.add("cat");
		int d = getpath(s,"hot","cog");
		System.out.println(d);
	}

}
class StrwithDistance
{
	String candidateString;
	int distance;
	StrwithDistance(String s, int d)
	{
		candidateString = s;
		distance = d;
	}
}
