import java.util.*;
public class NearestIndex {
	
	public static void nearestindex(int[] a)
	{
		Stack<Integer> s = new Stack();
		s.push(a[0]);
		int e;
		int next;
		for(int i=1;i<a.length;i++)
		{
            next = a[i];
            if(!s.isEmpty())
            {
            	e = s.pop();
            	while(e<next)
            	{
            		System.out.println(e+" "+next);
            		if(s.isEmpty()) break;
            		e=s.pop();
            	}
            	if(e>next)
            		s.push(e);
            }
            s.push(next);
		}
		while(!s.isEmpty())
		{
			e=s.pop();
			next=-1;
			System.out.println(e+" "+next);
			
		}
	}
	public static void main(String[] args)
	{
		int[] n = new int[]{3,9,1,0,5};
		nearestindex(n);
	}

}
