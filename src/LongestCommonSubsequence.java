
public class LongestCommonSubsequence {
	
	public static void getsequence(String text,String pattern)
	{
		int textidx=0;
		int patternidx=0;
		String common = "";
		String prev="";
		boolean inside = false;
		while(textidx < text.length() && patternidx<pattern.length())
		{
			if(text.charAt(textidx)==pattern.charAt(patternidx))
			{
				inside=true;
				common+=(text.charAt(textidx));
				
			}
			else
			{
				inside=false;
				if(common.length() > prev.length())
					prev=common;
				common="";
			}
			textidx++;
			patternidx++;
		}
		System.out.println(prev);
		
	}
	public static void main(String[] args)
	{
		getsequence("XYZmalayalamPQR", "RQPmalayalamZYX");
	}

}
