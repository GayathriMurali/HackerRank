
public class findsum_enhanced {
	public static void main(String[] args)
	{
		int[] a = new int[]{6,2,4,1,0,9,11};
		boolean result = findsum(a,5);
		if(result)
			System.out.println("Sum found");
		else
			System.out.println("Sum not found");
	}
	static boolean findsum(int[] a,int sum)
	{
		int start=0;
		int index=0;
		int found_so_far=0;
		for(int i=0;i<a.length;i++)
		{
			if(found_so_far==sum)
			{
					System.out.println("Sum found  from " + a[start]+ " until "+a[i]);
				return true;
			}
			if(found_so_far > sum)
			{
				while(found_so_far > sum && start<=i)
				{
					found_so_far-=a[start];
					start++;
				}
			}
			if(i<a.length)
				found_so_far+=a[i];
		}
		return false;
	}

}
