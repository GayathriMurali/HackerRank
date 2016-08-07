import java.util.*;
public class AlienDict {
	
	public static void main(String[] args)
	{
		String[] words={"abcd","abcb"};
		StringBuilder str= new StringBuilder();
		int num=3;
		Map<Character,Boolean> map = new HashMap<Character,Boolean>();
		for(int i =0;i<words.length;i++)
		{
			if(!map.containsKey(words[i].charAt(0)))
			    map.put(words[i].charAt(0),false);
		}
			getorder(words,0,0,map,str);
			System.out.println(str);
	}
	public static void getorder(String[] words,int n,int i,Map<Character,Boolean> map,StringBuilder str)
	{
		if(i==words.length-1)
		{
			for(Map.Entry<Character,Boolean> m: map.entrySet())
			{
				if(!m.getValue())
					str.append(m.getKey());
			}
			
			return;
		}
		/*if(n>=words[i].length() || n>=words[i+1].length())
		{
			getorder(words,0,++i,map,str);
			
		} */
		
            if(i+1<words.length && words[i].charAt(n)!=words[i+1].charAt(n))
			{
     
              if(!map.containsKey(words[i].charAt(n)) || !map.get(words[i].charAt(n)))
               {
            	 map.put(words[i].charAt(n),true);
            	 str.append(words[i].charAt(n));
               }
            
               if(!map.containsKey(words[i+1].charAt(n)))
               {
            	   map.put(words[i+1].charAt(n),false);
 		       }
                  n=0;
            getorder(words,n,++i,map,str);

			}
			else
			{
				getorder(words,++n,i,map,str);
			}
		
	}

}
