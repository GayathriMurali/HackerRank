import java.util.*;
public class MatrixZero {
    static void makezero(List<List<Integer>> a)
    {
    	int m=a.size();
    	int n=a.get(0).size();
    	boolean firstrow=false;
    	boolean firstcol=false;
    	
    	for(int i=0;i<m;i++)
    	{
    		if(a.get(i).get(0)==0)
    		{
    			firstcol=true;
    			break;
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(a.get(0).get(i)==0)
    		{
    			firstrow=true;
    			break;
    		}
    	}
    	for(int i=1;i<m;i++)
    	{
    		for(int j=1;j<n;j++)
    		{
    			if(a.get(i).get(j)==0)
    			{
    				a.get(i).set(0,0);
    				a.get(0).set(j,0);
    			}
    		}
    	}
    	for(int i=1;i<m;i++)
    	{
    		if(a.get(i).get(0)==0)
    			Collections.fill(a.get(i),0);
    	}
    	for(int i=1;i<n;i++)
    	{
    		if(a.get(0).get(i)==0)
    		{
    			for(int j=1;j<m;j++)
    				a.get(j).set(i,0);
    		}
    			
    	}
    	if(firstcol)
    	{
    		for(int i=0;i<m;i++)
    			a.get(i).set(0,0);
    	}
    	if(firstrow)
    	{
            Collections.fill(a.get(0),0);
    	}
    	for(int i=0;i<a.size();i++)
    	{
    		for(int j=0;j<a.get(0).size();j++)
    		{
    			System.out.print(a.get(i).get(j)+" ");
    		}
    		System.out.println();
    	}
    	
    }
    public static void main(String []args)
    {
    	int[][] a={{1,1,1,0,1},{1,1,1,1,1},{1,1,0,1,1},{0,1,1,1,1}};
    	List<List<Integer>> list = new ArrayList<List<Integer>>(4);
    	
    	for(int i=0;i<a.length;i++)
    	{
    		List<Integer> temp = new ArrayList();
    		for(int j=0;j<a[0].length;j++)
    		{
    			temp.add(j,a[i][j]);
    		}
    		list.add(temp);
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[0].length;j++)
    		{
    			System.out.print(list.get(i).get(j) + " ");
    		}
    		System.out.println("");
    	}
    	System.out.println("--------------------");
    	makezero(list);
    }
}
