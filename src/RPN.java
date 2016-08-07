import java.util.*;

//time complexity O(n)
//space complexity o(n)
public class RPN {
      static int value(String str,Deque<Integer> s)
      {
    	int v=Integer.MIN_VALUE;
    	for(int i =0;i<str.length();i++)
    	{
    		if(str.charAt(i)>='0' && str.charAt(i)<='9')
    			s.addFirst(str.charAt(i)-'0');
    		else
    		{
    			if(s.size() > 2 || s.size()<=0)
    				return -1;
    			int a = s.pollFirst();
        		int b = s.pollFirst();
        		if(str.charAt(i)=='+')
        			v=a+b;
        		else
        			if(str.charAt(i)=='*')
        				v=a*b;
        			else
        				if(str.charAt(i)=='-')
        					v=a-b;
        				else
        					if(str.charAt(i)=='/')
        						v=a/b;
        		s.addFirst(v);
    		}
    	}
    	return v;
      }
      public static void main(String[] args)
      {
    	  String str="*&*&*&";
    	  Deque<Integer> d = new LinkedList();
    	  int result = value(str,d);
    	  if(result==-1)
    		  System.out.println("improperly formed RPN");
    	  else
    	    System.out.println(result);
      }
}
