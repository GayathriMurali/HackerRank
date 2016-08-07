import java.util.*;
public class Hashmap<E,V> {
	
    E key;
    V value;
    List<E> keys;
    List<V>[] values;//= new LinkedList[keys.size()];
    
    Hashmap(){
    	keys = new ArrayList();
    	values= new LinkedList[10];
    }
    public void put(E e,V v)
    {
    	int h = hash(e.hashCode());
	     int index = getindex(h,keys.size());
	     
    	if(keys.size()==0)
    	{
    	     keys.add(e);
    	     values[index] = new LinkedList();
    	     values[index].add(v);
    	}
    	else
    	{
    		if(!keys.contains(e))
    		{
    			keys.add(index,e);
       	        values[index] = new LinkedList();
       	        values[index].add(v);
    		}
    		else
         	  values[index].add(v);
    	}
    }
    public List<V> get(E e)
    {
    	List<V> result = new LinkedList();
        if(keys.size()==0)
        {
        	System.out.println("Map empty");
        	return null;
        }
        else
        {
        	int h = hash(e.hashCode());
   	       int index = getindex(h,keys.size());
           return values[index];
        }
    }
    private static int hash(int h)
    {
    	h^=(h>>>20)^(h>>>12);
    	return h^(h>>>7)^(h>>>4);
    }
    private static int getindex(int h,int length)
    {
      return h & (length-1);
    }
    
    public static void main(String[] args)
    {
    	Hashmap h = new Hashmap();
    	h.put(1, 1);
    	h.put(2,2);
    	h.put(1,3);
    	h.put(1,5);
    	List<Integer> result = h.get(1);
    	for(int i =0;i<result.size();i++)
    		System.out.println(result.get(i));
    	
    }
}
