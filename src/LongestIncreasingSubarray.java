import java.util.*;
public class LongestIncreasingSubarray {
	
	static void findindex(List<Integer> a)
	{
		int maxlen_foundsofar=0;
		int maxlen_endinghere=0;
		int start_index=0;
//		int end_index=-1;
		int maxstart_index=-1;
		int maxend_index=-1;
		if(a.size()==1)
			System.out.println(a.get(0));
		for(int i=1;i<a.size();i++)
		{
			if(maxlen_endinghere>maxlen_foundsofar)
	    	  {
	    		  maxlen_foundsofar=maxlen_endinghere;
	    		  maxstart_index=start_index;
	    		  maxend_index=i-1;
	    	  }
		      if(a.get(i)>a.get(i-1))
		      {
		    	  
		    	  maxlen_endinghere++;
//		    	  end_index=i;
		      }
		       else
		       {
		    	  
		    	  start_index=i;
		    	  maxlen_endinghere=0;
		    	  
		       }
		    
	    }
		System.out.println(maxstart_index+" "+maxend_index);
	}
	public static void main(String[] args)
	{
		int []b = new int[]{2,11,3,5,13,7,19,17,23};
		List<Integer> a = new ArrayList();
		 for(int i =0;i<b.length;i++)
			 a.add(b[i]);
		findindex(a);
	}
}
