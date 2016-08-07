import java.util.ArrayList;
import java.util.Random;

public class ReservoirSampling {
     public static ArrayList<Integer> GenerateSamples(ArrayList<Integer> list, int k)
     {
    	 ArrayList<Integer> final_list = new ArrayList<Integer>();
    	 if(k<=0) {
    		 System.out.println("Sample size less than 0");
    	 }
    	 for(int i=0;i<k;i++)
    		 final_list.add(i,list.get(i));
    	 for(int j=k;j<list.size();j++) {
    		 Random rand = new Random();
    		 int next_index = rand.nextInt(j-0+1)+0;
    		 if(next_index >=0 && next_index<k)
    		 {
    			 int temp = final_list.get(next_index);
    			 final_list.set(next_index,list.get(j));
    			 list.set(j,temp);
    		 }
    	 }
    	 return final_list;
     }
     public static void main(String []args) {
    	 ArrayList<Integer> list = new ArrayList<Integer>();
    	 for(int i=5;i<15;i++)
    	   list.add(i);
    	 ArrayList<Integer> final_list = GenerateSamples(list,3);
         for(Integer i:final_list)
        	 System.out.println(i + " ");
     }
}
