
public class Multiply {
static int minhelper(int smaller, int bigger) {
	if(smaller == 0) return 0;
	else if ( smaller == 1) return bigger;
	int s = smaller >> 1;
	int side1 = minproduct(s,bigger);
	int side2 = side1;
	if(smaller % 2 == 1)
		side2=minhelper(smaller-s,bigger);
	
	return side1+side2;
	
}
static int minproduct(int a,int b) {
	int smaller = a < b? a:b;
	int bigger = a>b?a:b;
	 return minhelper(smaller,bigger);
}
public static void main(String[] args) {
	int product = minproduct(17,23);
	System.out.print(product);
}
}
