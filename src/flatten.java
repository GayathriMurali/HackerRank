import java.util.ArrayList;
import java.util.List;

public class flatten
{
   static List<Integer> flattenarray(List a, List<Integer> result,int count)
   {
         for(int i =0;i<a.size();i++)
        {
          if(a.get(i) instanceof List)
        	  flattenarray((List)a.get(i),result,count+1);
          else
          {
        	  result.add((Integer) a.get(i));
        	  System.out.println((Integer)a.get(i) * count);
          }
         }  
         return result;
   }
   public static <E> void main(String []args)
   {
      // List<E> list = new ArrayList<E>();
	   
	   List l = new ArrayList();
	   List a = new ArrayList();
	   a.add(1);
	   l.add(a);
       List b = new ArrayList();
       b.add(2);
       l.addAll(b);
       List c = new ArrayList();
       c.add(3);
       c.add(4);
       l.addAll(c);
       List d = new ArrayList();
       List e = new ArrayList();
       e.add(5);
       d.add(e);
       l.add(d);
      // l.add(8);
      // l.add(9);
       List<Integer> result = new ArrayList<Integer>();
       result = flattenarray(l,result,1);
       for(int i=0;i<result.size();i++)
           System.out.println(result.get(i));
       
    }
}


