
public class AllPossibleEncoding {
	static boolean isValid(String s){
        int num = Integer.parseInt(s);
		if(num>=1 && num <=26)
			return true;
		else
			return false;
	}
	static int numEncoding(String s){
		if(s.length()==0) return 1;
		if(s.length()==1) return 1;
		int num = 0;
		num += numEncoding(s.substring(1));
		if(isValid(s.substring(0,2)))
			num += numEncoding(s.substring(2));
		return num;
	}
	public static void main(String []args)
	{
		int n = numEncoding("12222");
		System.out.println(n);
	}

}
