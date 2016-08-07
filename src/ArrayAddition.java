// Array addition ( add 1)
// O(n)
public class ArrayAddition {
	static void add(int[] a)
	{
		if(a.length<=0) return;
		boolean signflag=false;
		if(a[0] < 0)
		{
			a[0]*=-1;
			signflag=true;
		}
		int carry =0;
		int sum = 0;
		for(int i = a.length-1;i>=0;i--)
		{
			if(i==a.length-1)
				sum=(a[i] +1);
			else
				sum = (carry + a[i]);
			
				a[i] = sum % 10;
				carry = sum/10;
				continue;
		}
		if(signflag)
			a[0] = a[0] * -1;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	public static void main(String []args)
	{
		int[] a = new int[]{-1,2,9,9};
		add(a);
	}

}
