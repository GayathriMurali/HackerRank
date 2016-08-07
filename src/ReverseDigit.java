
// reverse a number
// time complexity O(n)
public class ReverseDigit {
    static int reversedigit(int n)
    {
    	if(n>=0 && n<=9) return n;
        int reverse=0;
        boolean signflag=false;
        if(n<0)
        {
        	n=n*-1;
        	signflag=true;
        }
         while(n!=0)
        {
        	reverse=(reverse*10) + (n%10);
        	n=n/10;
        }
         if(signflag)
        	 return -1 * reverse;
         else
        	 return reverse;
    }
    public static void main(String[] args)
    {
    	int n=1234;
    	int reverse = reversedigit(n);
    	System.out.println(reverse);
    }
}
