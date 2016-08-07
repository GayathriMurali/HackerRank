import java.util.*;
public class KthSmallestSortedArrays {
	public static int findk(List<Integer> l1,List<Integer> l2,int k)
	{
		int p1=0;int p2=0;
		int j=k;
		while(k>0 && (p1<l1.size() || p2<l2.size()))
		{
			if(l1.get(p1) >= l2.get(p2))
			{
				k--;
				if(p2+1<l2.size())
				   p2++;
				else
					return l1.get(j-k);
			}
			else
				
			{
				k--;
				if(p1+1<l1.size())
					   p1++;
					else
						return l2.get(j-k);
				//p1++;
			}
			if(k==0)
				return Math.min(l1.get(p1),l2.get(p2));
		}
		return -1;
	}
	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		List<Integer> l2=new ArrayList();
		l2.add(2);
		//l2.add(2);
		//l2.add(3);
		int r = findk(l1,l2,3);
		System.out.println(r);
	}

}
