import java.util.*;

public class RomanToNumber {
    static HashMap<Character,Integer> map;
    RomanToNumber()
    {
    	map = new HashMap<Character,Integer>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C',100);
    }
    public static int romanNumber(String s)
    {
    	int num=0;
    	char[] str = s.toCharArray();
    	char prevchar='\0';
    	for(Character c : str)
    	{
    		if(!map.containsKey(c))
    			return -1;
    		else
    		{
    			num+=map.get(c);
    		    if(prevchar!='\0' && (map.get(prevchar) < map.get(c)))
    		    		{
    		    	           num-=2*map.get(prevchar);
    		    		}
    		    prevchar=c;
    		}
    		
    	}
    	return num;
    	
    }
    public static void main(String[] args)
    {
    	RomanToNumber rn = new RomanToNumber();
		System.out.println("I=" + rn.romanNumber("I"));
		System.out.println("III=" + rn.romanNumber("III"));
		System.out.println("VI=" + rn.romanNumber("VI"));
		System.out.println("XVI=" + rn.romanNumber("XVI"));
		System.out.println("IV=" + rn.romanNumber("IV"));
		System.out.println("IX=" + rn.romanNumber("IX"));
		System.out.println("XIV=" + rn.romanNumber("XIV"));
		System.out.println("LXIV=" + rn.romanNumber("LXIV"));
    }
}
