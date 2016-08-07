import java.util.*;
public class DotProduct {
	public static void main(String[] args)
	{
	    List<sparse_vector> list = new ArrayList();
	    list.add(new sparse_vector(1,1));
	    list.add(new sparse_vector(4,4));
	    list.add(new sparse_vector(2,4));
	    
	    List<sparse_vector> list1 = new ArrayList();
	    list1.add(new sparse_vector(5,1));
	    list1.add(new sparse_vector(4,1));
	    list1.add(new sparse_vector(2,1));
	    Collections.sort(list);
	    Collections.sort(list1);
	    int len = list.size() > list1.size() ? list1.size():list.size();
	    for(sparse_vector s : list)
	    	System.out.println(s.index+" "+s.data);
	    for(sparse_vector s : list1)
	    	System.out.println(s.index+" "+s.data);
	    
	    dotproduct(list,list1,len);
	}
	public static void dotproduct(List<sparse_vector> list, List<sparse_vector> list1,int len)
	{
		int sum=0;
	    int i=0;
	    int j=0;
	    while(i<len && j<len)
	    	{
	    		if(list.get(i).index==list1.get(j).index)
	    		{
	    		     sum=sum+(list.get(i).data * list1.get(i).data);	
	    		     i++;
	    		     j++;
	    		}
	    		else
	    		if(list.get(i).index>list1.get(j).index)
				{
					j++;
				}
	    		else
	    		if(list.get(i).index<list1.get(j).index)
	    		{
	    			
	                i++;

	    		}
	    		//if(i>=len || j>=len)
	    			//break;
	    	}
	    System.out.println(sum);
	}
}
class sparse_vector implements Comparable<sparse_vector>
{
	int index;
	int data;
	sparse_vector(int i,int d)
	{
		data=d;
		index=i;
	}
	public int compareTo(sparse_vector s)
	{
		return Integer.compare(this.index,s.index);
	}
}
