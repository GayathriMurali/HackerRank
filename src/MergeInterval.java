import java.util.*;
public class MergeInterval {
	
	public static void main(String[] args)
	{
	  List<interval> l = new LinkedList();
	  interval a = new interval(1,3);
	  interval b = new interval(2,4);
	  interval c = new interval(5,7);
	  interval d = new interval(6,8);
	  //interval e = new interval(1,3);
	  
	  l.add(a);
	  l.add(b);
	  l.add(c);
	  l.add(d);
	  List<interval> result = new LinkedList();
	  result = mergeinterval(l);
	  for(int i =0;i<result.size();i++)
		  System.out.println(result.get(i).left+" "+result.get(i).right);
	}
    static List<interval> mergeinterval(List<interval> l)
    {
    	List<interval> result = new LinkedList();
    	//Stack<interval> s = new Stack<interval>();
    	Collections.sort(l, new intervalcomp());
    	//int i =0;
    	interval pre = l.get(0);
    	for(int i=0;i<l.size();i++)
    	{
    	
    		interval curr = l.get(i);
    		if(i+1<l.size() && pre.right < curr.left)
    		{
    			result.add(pre);
    			pre=curr;
    		}
    	    
    		if(i+1<l.size() && l.get(i+1).left > pre.left)
    		{
    			if(pre.right < l.get(i+1).right)
    			{
    				interval merged = new interval(pre.left,l.get(i+1).right);   
    				
                    pre = merged;	
    				//l.set(i,new interval(l.get(i).left,l.get(i+1).right));
    			}
    		    
    			
    		}
    		i++;
    	}
    	result.add(pre);
    	return result;
    }
	
	
         
}
class interval 
{
	int left;
	int right;
	interval(int l,int r)
	{
		left=l;
		right=r;
	}

}
class intervalcomp implements Comparator<interval>
{
	public int compare(interval i1,interval i2)
	{
	      return Integer.compare(i1.left, i2.left);
	}
}
