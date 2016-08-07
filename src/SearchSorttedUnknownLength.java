import java.util.*;
public class SearchSorttedUnknownLength {
	
/*	static int search(List<Integer> l,int k)
	{
		int mid=-1;
		int low = 0;
		int length = findlength(l);
		int high = length;
		while(low<=high)
		{
			mid = (low+high)/2;
	        if(l.get(mid)==k)
	        	return mid;
	        else
	        	if(l.get(mid) < k)
	        		low = mid+1;
	        	else
	        		high = mid-1;
		}
		return -1;
	} */

	static int findlength(List<Integer> l,int k)
	{
		int i =0;
		int indx = i;
		while(true)
		{
			try
			{
				indx = (1 << i) -1;
				if(k==l.get(indx))
				   return indx;
				i++;
				 			    
			}catch(IndexOutOfBoundsException e)
			{
				return binarysearchindex(l,((1<<i-1)-1),((1<<(i))-1),k);
			}
		}
	}
	static int binarysearchindex(List<Integer> l,int low,int high,int k)
	{
		int mid=0;
		while(low<high)
		{
			try
			{
			   mid = (low + high)/2;
			   if(k==l.get(mid))
				   return mid;
			   //int temp = l.get(mid);
			   if(k>l.get(mid))
			      low=mid+1;
			   if(k<l.get(mid))
				   high=mid-1;
			}catch(IndexOutOfBoundsException e)
			{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		int r = findlength(l,8);
		System.out.println(r);
	}

}
