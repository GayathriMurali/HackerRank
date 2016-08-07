import java.util.*;
public class LongestSubarraySum {

	public static void main(String []args)
	{
		int[] a = new int[]{431,-15,639,342,-14,565,-924,635,167,-70};
		findsubarray(a,7);
		
	}
	static void findsubarray(int[] a,int k)
	{
		List<Integer> prefixSum = new ArrayList<>();
		int sum =0;
		for(int i =0;i<a.length;i++)
		{
			sum += a[i];
			prefixSum.add(i,sum);
		}
		List<Integer> minprefixSum = new ArrayList<>(prefixSum);
		for(int i = minprefixSum.size()-2;i>=0;i--)
		{
			minprefixSum.set(i,Math.min(minprefixSum.get(i),minprefixSum.get(i+1)));
		}
		int x=0;
		int y=0;
		int maxlen=0;
		while(x<a.length && y<a.length)
		{
			int currsum = x>0?(minprefixSum.get(y)-prefixSum.get(x-1)):minprefixSum.get(y);
			if(currsum<=k)
			{
				int len = y-x+1;
				if(maxlen<len)
					maxlen=len;
				y++;
			}
			else
				x++;
			
		}
		System.out.println(maxlen);
	}
}

