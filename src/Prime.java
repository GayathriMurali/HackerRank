
public class Prime {
	static void findprime(int n)
	{
	   if(n<2) return;
	   if( n > 2 || n==2)
	      System.out.println(2);
	   for(int j=3;j<=n;j++)
	   {
	        if(j%2!=0 && (j%3!=0 || j==3) && (j%5!=0 || j==5) && (j%7!=0 || j==7))
	           System.out.println(j);
	   }
	}
	public static void main(String []args)
	{
		int n=20;
		findprime(n);
	}
}
