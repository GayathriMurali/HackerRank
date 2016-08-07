
public class BarChartWater {
	public static void main(String []args)
	{
		int[] hist = new int[]{0,0,4,0,0,6,0,0,3,0,8,0,2,0,5,2,0,3,0,0};
		volumehelper(hist);
	}
	public static void volumehelper(int []hist)
	{
		int[] leftmax= new int[hist.length];
		int leftMax=0;
		for(int i=0;i<hist.length;i++)
		{
			leftMax= Math.max(leftMax, hist[i]);
			leftmax[i]=leftMax;
		}
		
		int rightMax=hist[hist.length-1];
		int sum=0;
		for(int i=hist.length-1;i>=0;i-- )
		{
			rightMax=Math.max(rightMax,hist[i]);
			int secondtallest = Math.min(rightMax,leftmax[i]);
			if(secondtallest > hist[i])
				sum+=secondtallest-hist[i];
		}
		System.out.println(sum);
	}

}
