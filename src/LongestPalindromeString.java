import java.util.*;
public class LongestPalindromeString {
	
	static String checkpalindrome(String str)
    {
      PriorityQueue<String> pq = new PriorityQueue<String>(10,new  checkstring());
       int length = str.length();
      int maxlen=0;
       String maxString="";
         for(int i=0;i<length;i++)
         {
           for(int j=i+1;j<length-1;j++)
           {
             String prefix = str.substring(i,j+1);
             // TODO Check reverse here
             if(prefix.equals(reverse(prefix)))
             {
                 if(prefix.length() > maxlen)
                 {
                     maxlen = prefix.length();
                     // maxString=prefix;
                      pq.offer(prefix);
                     
                 }
             }     
           
         }
       }
     String result="";
      if(!pq.isEmpty())
      {
          result = pq.poll();   
        return result;
                     
      } 
      
    // return maxString;
      else
        return null; 
      

}
  static String reverse(String s)
  {
       StringBuilder sb = new StringBuilder();
       if(s!=null)
       {
         for(int i=s.length()-1;i>=0;i--)
          sb.append(s.charAt(i));
       }
       return sb.toString();
  }
  public static void main(String []args)
  {
       String str = "xyxaaaaabcba";
        String result = checkpalindrome(str);
        System.out.println(result);
  }
}
class checkstring implements Comparator<String>
{
     public int compare(String s1,String s2)
     {
         return s2.length()-s1.length();
     }
}

