
	public class stockprice
	{
	    public static void  main(String []args)
	    {
	        int []prices = new int[]{310,315,275,295,260,270,290,230,255,250};
	        int profit = findmaxprofit(prices);
	        System.out.println(profit);
	    }
	    static int findmaxprofit(int[] prices)
	    {
	        int diff=0;
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<prices.length-1;i++)
	        {
	            diff+=prices[i+1]-prices[i];
	            if(diff<0)
	              diff=0;
	             if(diff>0)
	             {
	                 if(diff > max)
	                    max=diff;
	             }
	        }
	        return max;
	      }
}
