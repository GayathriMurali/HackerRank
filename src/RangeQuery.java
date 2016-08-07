import java.util.*;

class Interval
{
	String left;
	String right;
	boolean leftIncluded;
	boolean rightIncluded;
	Interval(String l,String r,boolean isLeft,boolean isRight)
	{
		left=l;
		right=r;
		leftIncluded=isLeft;
		rightIncluded=isRight;
	}
	Interval()
	{
		
	}
	
}
public class RangeQuery {
	List<MergeInterval> textRanges = new ArrayList<MergeInterval>();
    void addInterval(MergeInterval newInterval)
    {
    	if(textRanges.size()==0)
    	{
    		textRanges.add(newInterval);
    	}
    	else
    	{
    		int i=0;
    		int begin=0;
    		int end=0;
    		while(i<textRanges.size() && newInterval.left.compareTo(textRanges.get(i).right)>=0)		
    		{
    			i++;
    			begin=i;
    		}
    		
    		while(i < textRanges.size() && newInterval.right.compareTo(textRanges.get(i).left) >=0){
    			newInterval = new MergeInterval(min(newInterval.left,textRanges.get(i).left),max(newInterval.right,textRanges.get(i).right),newInterval.leftIncluded,newInterval.rightIncluded);
    			++i;
    			end=i;
    			
    		}
    		for(int j=begin;j<end;j++)
    			textRanges.remove(j);
    		textRanges.add(newInterval);
    	}
    	
    }
    private void printList()
    {
    	for(int i =0;i<textRanges.size();i++)
    		System.out.println(textRanges.get(i).left+" "+textRanges.get(i).right);
    }
    private String min(String s1,String s2)
    {
    	return (s1.compareTo(s2)<=0?s1:s2);
    }
    private String max(String s1,String s2)
    {
    	return (s1.compareTo(s2)<=0?s2:s1);
    }
    boolean deleteInterval(MergeInterval newInterval)
    {
    	if(textRanges.size()!=0)
    	{
        		int i=0;
        		int begin=-1;
        		int end=-1;
        		while(i<textRanges.size() && newInterval.left.compareTo(textRanges.get(i).right)>=0)		
        		{
        			i++;
        		}
        		begin = i;
        		while(i < textRanges.size() && newInterval.right.compareTo(textRanges.get(i).left) >=0)
        		{
        			++i;	
        		}
    	        end= i-1;
    	        if(begin<textRanges.size() && begin!=-1 && end!=-1)
    	        {
        		  MergeInterval part1 = new MergeInterval(textRanges.get(begin).left,newInterval.left,true,false);
        		  MergeInterval part2 = null;
        		  if(!newInterval.right.equals(textRanges.get(end).right))
        		     part2 = new MergeInterval(newInterval.right,textRanges.get(end).right,false,true);
    		      int j=0;
    		      int remove_index=0;
    		      while(j<=end)
    		      {
    		    	 textRanges.remove(remove_index);
    		    	 j++;
    		      }
    		      textRanges.add(begin, part1);
    		      if(part2!=null)
        		     textRanges.add(begin+1,part2);
        		  return true;
    	        }

    	}
    	return false;
    }
    boolean queryInterval(String newInterval)
    {
    	boolean found = false;
    	if(textRanges.size()!=0)
    	{
        		int i=0;
        		while(i<textRanges.size() && newInterval.compareTo(textRanges.get(i).right)>=0)		
        		{
        			i++;
        		}
        		if(i<textRanges.size() && newInterval.compareTo(textRanges.get(i).left)>=0 && newInterval.compareTo(textRanges.get(i).right)<=0)
        			found=true;
    	}
    	
    	return found;
    }
    public static void main(String[] args)
    {
    	// Testing Insertion:
    	System.out.println("\nTESTING INSERTION");
    	RangeQuery rq= new RangeQuery();
    	rq.addInterval(new MergeInterval("AaA","BaB",true,true));
    	rq.addInterval(new MergeInterval("Aac","CaC",true,true));
    	rq.addInterval(new MergeInterval("Dd","Df",true,true));
    	rq.printList();
        
    	// Testing Deletion:
    	System.out.println("\nTESTING DELETION");
    	rq= new RangeQuery();
    	rq.addInterval(new MergeInterval("AaA","BaB",true,true));
    	rq.addInterval(new MergeInterval("Aac","CaC",true,true));
    	rq.addInterval(new MergeInterval("Dd","Df",true,true));
    	MergeInterval l = new MergeInterval("BaC","CaC",true,true);
    //  Interval l = new Interval("Aaab","De",true,true);
    	boolean result = rq.deleteInterval(l);
    	if(result)
    	   rq.printList();
    	
    	// Testing Query:
    	System.out.println("\nTESTING QUERY");
    	String query="AA";
    	result = rq.queryInterval(query);
    	if(result)
        	   System.out.println(query + " found within range");
           else
        	   System.out.println(query + " out of range");
    	
    	query="BaB"; 
    	result = rq.queryInterval(query);
    	if(result)
     	   System.out.println(query + " found within range");
        else
     	   System.out.println(query + " out of range");
    	
    	query="Cblahblah";
    	result = rq.queryInterval(query);
    	if(result)
     	   System.out.println(query + " found within range");
        else
     	   System.out.println(query + " out of range");
    }
}
