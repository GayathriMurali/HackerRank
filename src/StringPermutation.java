import java.util.*;
public class StringPermutation {
	static List<String> result = new ArrayList();
	public static void main(String[] args)
	{
		String str="abc";
	
		getpermute(str.toCharArray(),0,3);//getpermutation("",str);
		for(String s: result)
		{
			System.out.println(s);
		}
	}
	public static void getpermute(char[] cs,int l,int r)
	{
		int i;
		
		if(l==r)
			result.add(cs.toString());
		else
		{
			for(i =l;i<r;i++)
			{
				swap(cs,l,i);
				getpermute(cs,l+1,r);
				swap(cs,l,i);
			}
		}
		//return result;
	}
	private static void swap(char[] str,int i,int j)
	{
		char temp = str[i];
		str[i]=str[j];
		str[j]=temp;
		
	}
/*	public static List<String> getpermutation(String prefix,String str)
	{
		List<String> result = new ArrayList();
		int n = str.length();
		if(n==0)
			result.add(prefix);
		for(int i =0;i<n;i++)
			result.addAll(getpermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n)));
		return result;
	}*/

}
