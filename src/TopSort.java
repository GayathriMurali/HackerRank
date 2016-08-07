import java.util.*;

public class TopSort {
      static List<Integer> adj[];
      static int vertices;
      TopSort(int v)
      {
    	  vertices = v;
    	  adj = new LinkedList[v];
    	  for(int i =0;i<v;i++)
    	      adj[i] = new LinkedList();
      }
      void addEdge(int v,int u)
      {
    	  adj[v].add(u);
      }
      public static void main(String[] args)
      {
    	  TopSort g = new TopSort(6);
    	  g.addEdge(5, 2);
          g.addEdge(5, 0);
          g.addEdge(4, 0);
          g.addEdge(4, 1);
          g.addEdge(2, 3);
          g.addEdge(3, 1);
    	  g.topologicalsort();
          
      }
      static void topologicalsort()
      {
    	  Stack<Integer> s = new Stack();
    	  boolean[] visited = new boolean[vertices];
    	  for(int i =0;i<visited.length;i++)
    		     visited[i]=false;
    	  
    	  for(int i=0;i<visited.length;i++)
    	  {
    		  if(!visited[i])
    			  topsortutil(i,visited,s);
    	  }
    	  while(!s.isEmpty())
    		  System.out.println(s.pop());
    	  
      }
      static void topsortutil(int v,boolean[] visited,Stack<Integer> s)
      {
    	  Integer i;
    	  visited[v] = true;
    	  Iterator<Integer> it = adj[v].iterator();
    	  
    	  while(it.hasNext())
    	  {

    		   i = it.next();
    		   if(!visited[i])
    			   topsortutil(i,visited,s);
    	  }
    	  s.push(v);
      }
}
