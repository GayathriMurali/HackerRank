
public class CheckStringIsNum {

	public static boolean checkstr(String s)
	{
		if(s.equals("")) return false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='-' && i==0) continue;
			else
			if(s.charAt(i)>='0' && s.charAt(i)<='9') continue;
			else
				if(s.charAt(i)=='.' && i<s.length()-1) continue;
				else
					return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		boolean result = checkstr("123 123");
		if(result)
			System.out.println("String is number");
		else
			System.out.println("String is not number");
	}
}
