
public class Boggle {

	static String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO"};
	public static void main(String[] args)
	{
		char[][] boggle = {{'G','I','Z'},
                {'U','E','K'},
                {'Q','S','E'}};
		findWords(boggle);

	}
	public static void findWords(char[][] boggle)
	{
		boolean[][] visited=new boolean[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				visited[i][j]=false;
		String result="";
		for(int i =0;i<boggle.length;i++)
			for(int j=0;j<boggle[0].length;j++)
				 findwordsutil(boggle,visited,i,j,result);
		
	}
	static void findwordsutil(char[][] boggle,boolean[][] visited,int i,int j,String result)
	{
		visited[i][j]=true;
		result+=boggle[i][j];
		
		if(isword(result))
			System.out.println(result);
		
		for(int x=i-1;x<=i+1 && x<boggle.length;x++)
			for(int y=j-1;y<=j+1 && y<boggle[0].length;y++)
			   if(x>=0 && y>=0 && !visited[x][y])
				   findwordsutil(boggle,visited,x,y,result);
		String temp = result.substring(0,result.length()-1);
		result = temp;
		visited[i][j] = false;
	
	}
	static boolean isword(String str)
	{
		for(int i =0;i<dictionary.length;i++)
			if(str.equals(dictionary[i]))
				return true;
		return false;
	}
}
