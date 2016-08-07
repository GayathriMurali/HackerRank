
import java.util.*;
public class getmajority { 
     public static boolean majorityelement(int[] a) 
     { 
       Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
       for(int i=0;i<a.length;i++) 
     { 
       if(map.containsKey(a[i]))
          map.put(a[i],map.get(a[i])+1); 
       else 
          map.put(a[i],1); 
     }
     int maxcount=-1; 
     boolean result = false;
     Iterator it = map.entrySet().iterator();
     while(it.hasNext())
     {
        Map.Entry pair = (Map.Entry)it.next();
        //TODO: Check correctness
        
            if(maxcount < (int)pair.getValue())
            {
               maxcount=(int)pair.getValue();
               result = false;
             }
              else
              if(maxcount > (int)pair.getValue())
                 continue;
              else
              {
                  result = true;
              }
                
        }
        return !result;
       }
     public static void main(String[] args)
     {
    	 int[] a = new int[]{1,2,2,3,4};
    	 boolean result = majorityelement(a);
    	 if(result)
    		 System.out.println("Majority element exists");
    	 else
    		 System.out.println("No Majority element exists");
     }
       }