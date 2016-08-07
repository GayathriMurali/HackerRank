import java.util.*;

public class CheckAnonMag
{
   public static void main(String []args)
   {
       String Anon="hi there";
       String mag="hi there";
       boolean result = checkifconstruct(Anon,mag);
       if(result)
          System.out.println("Can be constructed");
       else
          System.out.println("cannot be constructed");
   }
   
   public static boolean checkifconstruct(String Anon, String mag)
   {
       
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i=0;i<Anon.length();i++)
       {
           if(!map.containsKey(i))
           {
               map.put(Anon.charAt(i),1);
           }
           else
           { 
               map.put(Anon.charAt(i), map.get(Anon.charAt(i)) +1);
           }
       }
       for(int i=0;i<mag.length();i++)
       {
            if(map.containsKey(mag.charAt(i)))
            {
                  map.put(mag.charAt(i),map.get(mag.charAt(i))-1);
                  if(map.get(mag.charAt(i))==0)
                     map.remove(mag.charAt(i));
             }
        }
        if(map.isEmpty())
          return true;
        else
           return false;
         
       }
   }