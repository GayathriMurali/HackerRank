
public class Sqrt {
	
	public static Double sqrt(Double num,Double s)
	{
		if(num==0)
			return 0.0;
		if(num==1)
		{
			s=1.0;
			return s;
		}
		else
		{
              s=(sqrt(num-1,s)+num/sqrt(num-1,s))/2;
              return s;
		}
		
			
		
		
	}
	public static void main(String[] args)
	{
		Double num=0.0;
		Double sr=0.0;
		sr=sqrt(num,sr);
		System.out.println(sr);
	}

}
