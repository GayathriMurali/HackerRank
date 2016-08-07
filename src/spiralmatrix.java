import java.util.*;

public class spiralmatrix {
	public void printmatrix(List<List<Integer>> a,int row, int col, List<Integer> result)
	{
            for(int i =row;i<row-1;i++)
            {
            	for(int j=0;j<col-1;j++)
            	{
            		System.out.println(a.get(i).get(j));
            		
            	}
            }
            printmatrix(a,)
	}

}
