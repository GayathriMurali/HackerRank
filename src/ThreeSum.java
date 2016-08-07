import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {
	
	public static void main(String[] args) {
		int[] arr = {-4,5,2,3,8,11,-1};
	   // findsum(arr);	// this finds all numbers in an array such that a+b=c (o(n^2))
	   // int sum = 1;
	   // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	   // boolean result = findsum(arr,sum,map); // finds a+b=c with extra space
	   // if(result)
	   // 	System.out.println("Sum found");
	    int target = 100;
	    boolean found = checksum(arr,target); //finds if 3 numbers add up to a sum in an array
	    if(found)
	    	System.out.println("Sum found");
	    else
	    	System.out.println("Sum not found");
	    find3numbers(arr); // this determines 3 numbers in an array that sum to zero
	    
	}
    public static void findsum(int []arr) {
    	//o(n^2) solution
    	Arrays.sort(arr); //o(nlogn) here
    	for(int i = arr.length-1;i>=0;i--)
    	{
    	  int low = 0;
    	  int high = i;
    	  while(low<high) {
    		int curr_sum = arr[low] + arr[high];
    			if(arr[i]==curr_sum) {
    				System.out.println("Sum found at :" + arr[low] + " "+ arr[high] + " =" + arr[i]);
    				break;
    			} 
    			else
    				if(arr[i]>curr_sum)
    					low++;
    				else
    					high--;
    		}
    	}
    }
    public static boolean findsum(int []arr,int sum) {
    	
    	//O(nlogn) solution
        Arrays.sort(arr);  //O(nlogn)
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {         //O(n)
        	if(sum==arr[low]+arr[high])
        		return true;
        	else
        		if(sum<arr[low]+arr[high])
        			high--;
        		else
        			low++;
        }
        return false;
    }
    public static boolean findsum(int[]arr, int sum,HashMap<Integer,Integer> map)
    {
    	//o(n) solution
    	for(int i =0;i<arr.length;i++) {
    		    map.put(arr[i], 0);
    		    if(map.containsKey(sum-arr[i]))
    		    	 return true;
    		    
    	}
    	return false;
    	
    }
    public static boolean checksum(int[] arr,int sum)
    {
    	Arrays.sort(arr);
    	for(int i=arr.length-1;i>=0;i--)
    	{
    		int low = 0;
    		int high = i;
    		while(low<=high)
    		{
    			int curr_sum = arr[low] + arr[high];
    			if(arr[i]-sum==curr_sum)
    				return true;
    			else
    				if(arr[i]-sum > curr_sum)
    					low++;
    				else
    					high--;
    		}
    		
    	}
    	return false;
    }
    public static void find3numbers(int []a)
    {
    	Arrays.sort(a);
    	for(int i=a.length-1;i>=0;i--)
    	{
    		int low=0;
    		int high=i;
    		while(low<=high)
    		{
    			int curr=a[low]+a[high];
    			if(curr+a[i]==0)
    			{
    					System.out.println("Sum found at : " + a[low]+" "+a[high]+ " "+ a[i]);
    					break;
    			}
    			else
    				if(curr+a[i]>0)
    					high--;
    				else
    					low++;
    		}
    	}
    }
    
}
