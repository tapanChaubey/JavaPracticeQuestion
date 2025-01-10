package Graph;
import java.util.*;
public class BFStrevasal {
    static class  Edge {
     int src;
     int dest;
     int wt;
     public Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
     } 
     
    }
  static void CreateGraph(ArrayList<Edge>graph[]){
      for(int i=0; i<graph.length; i++){
        graph[i]=new ArrayList<>();
      }
     graph[0].add(new Edge(0, 1, 1));
     graph[0].add(new Edge(0, 2, 1));
     graph[1].add(new Edge(1, 3, 1));
     graph[1].add(new Edge(1, 0, 1));
     graph[2].add(new Edge(2, 0, 1));
     graph[2].add(new Edge(2, 1, 1));
     graph[2].add(new Edge(2, 4, 1));
     graph[4].add(new Edge(4, 2, 1));
     graph[4].add(new Edge(4, 5, 1));
     graph[4].add(new Edge(4, 3, 1));
     graph[3].add(new Edge(3, 5, 1));
     graph[3].add(new Edge(3, 1, 1));
     graph[3].add(new Edge(3, 4, 1));
     graph[5].add(new Edge(5, 4, 1));
     graph[5].add(new Edge(5, 3, 1));

  }
static void display(ArrayList<Edge>graph[]){
     for(int i=0; i<graph.length; i++){
        for(int j=0; j<graph[i].size(); i++){
        System.out.println("{"+graph[i].get(j).src+","+graph[i].get(j).dest+"}");
        }
     }
}

static void Bfs(ArrayList<Edge>graph[]){
  Queue<Integer>q=new LinkedList<>();
  boolean vis[]=new boolean[graph.length];
  q.add(0);
   while (!q.isEmpty()) {
    int curr=q.remove();
     if(!vis[curr]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            q.add(graph[curr].get(i).dest);
        }
     }
    
   }
}

    public static void main(String[]args){
      ArrayList<Edge>graph[]=new ArrayList[7];
      CreateGraph(graph);
      //display(graph);
      Bfs(graph);

    }
}
