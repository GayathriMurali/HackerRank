
public class GCD {
	
	static int gcd(int a,int b) {
		
		if(a==0) return b;
		return gcd(b%a,a);
		
	}
	public static void main(String[] args) {
		
		
		int n = gcd(1002,-21);
		
		System.out.println(n);
	}

}
