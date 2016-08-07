
public class getmajorityoptimized {
	
	public static void main(String[] args)
	{
		int[] a = new int[]{1,2,3,4,5};
		boolean result=getmajority(a);
		if(result)
			System.out.println("Majority element exists");
		else
			System.out.println("Majority element doesnt exist");
	      	
	}
    public static boolean getmajority(int[] a)
    {
    	int count=0;
    	int candidate=-1;
    	int maxcount=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(count==0)
    		{
    			candidate=a[i];
    			count=1;
    		}
    		else
    		{
    			if(candidate==a[i])
    				count++;
    			else
    				count--;
    		}
    		if(count>maxcount)
    			maxcount=count;
    	}
    	System.out.println(maxcount);
    	if(count<=0)
    		return false;
    	else
    		return true;
    }
}
