import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	int capacity;
	Map<Integer,Integer> map;
	LRUCache(int c)
	{
		capacity = c;
		map=new LinkedHashMap<Integer,Integer>(capacity,1.0f,true){
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e)
			{
				return this.size() > capacity;
			}
		};
		
	}
	void insert(int key,int value)
	{
		synchronized(map)
		{

		  if(!map.containsKey(key))
		  {
			map.put(key,value);
		  }
		  else
		  {
			int v = map.get(key);
			v=value;
			map.put(key, v);
			
		   }
		 }
	}
	int get(int key)
	{
		return map.containsKey(key) ? map.get(key):null;
	}
	void remove(int key)
	{
		synchronized(map)
		{
		  map.remove(key);
		}
	}
}

