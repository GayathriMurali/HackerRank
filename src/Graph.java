import java.util.*;
public class Graph
{
      int V;
      List<LinkedList<Integer>> n;
      Graph(int vertex)
      {
    	  V=vertex;
    	  n = new LinkedList<LinkedList<Integer>>();
    	  for(int i=0;i<V;i++)
    	     n.add(i, new LinkedList<Integer>());
      }
      public void addedge(int v,int w)
      {
    	  n.get(v).add(w);
      }
      public void traverse(int s)
      {
    	  List<Boolean> visited = new ArrayList(V);
    	  for(int i=0;i<V;i++)
    		  visited.add(i,false);
    	  Queue<Integer> q = new LinkedList<Integer>();
    	  q.add(s);
    	  visited.add(s, true);
    	  while(!q.isEmpty())
    	  {
    	      int x = q.poll();
    	      System.out.println(x);
    	      Iterator i = n.get(s).iterator();
    	      while(i.hasNext())
    	      {
    	    	  int edge = (Integer)i.next();
    	    	  if(!visited.get(edge))
    	    	  {
    	    		  visited.add(edge,true);
    	    		  q.add(edge);
    	    		  
    	    	  }
    	      }
    	  }
    	  
      }
      public void DFS_traverse(int s)
	  {
		  boolean[] visited = new boolean[V];
		  for(int i=0;i<V;i++)
			  visited[i]=false;
		  Stack<Integer> st = new Stack<Integer>();
		  st.push(s);
		  visited[s] = true;
		  while(!st.isEmpty())
		  {
			  int x = st.pop();
			  System.out.println(x);
			  Iterator i = n.get(s).iterator();
			  while(i.hasNext())
			  {
				  int edge = (Integer)i.next();
				  if(!visited[edge])
				  {
				    st.push(edge);
				    visited[edge] = true;
				  }
			  }
			  
		  }
		  
	  }
      public static void main(String[] args)
      {
    	  Graph g = new Graph(4);
          g.addedge(0, 1);
          g.addedge(0, 2);
          g.addedge(1, 2);
          g.addedge(2, 0);
          g.addedge(2, 3);
          g.addedge(3, 3);
          //g.traverse(2);
          g.DFS_traverse(2);
      }
}
      