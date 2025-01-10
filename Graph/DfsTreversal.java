package Graph;
import java.util.*;
public class DfsTreversal {
    static class Edge{
      int dest;
      int src;
      int wt;
      public Edge(int src,int dest,int wt){
        this.dest=dest;
        this.src=src;
        this.wt=wt;
      }
        
    }
    static void CreateGraph(ArrayList<Edge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 1, 1));
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
         for(int j=0; j<graph[i].size(); j++){
        System.out.println("{"+graph[i].get(j).src+","+graph[i].get(j).dest+"}");
         }
     }
   }
static void dfs(ArrayList<Edge>graph[],boolean vis[],int curr){
    System.out.print(curr+" ");
    vis[curr]=true;
    for(int i=0; i<graph[curr].size(); i++){
        Edge e=graph[curr].get(i);
         if(!vis[e.dest]){
            dfs(graph, vis, e.dest);
         }
    }

}


    public static void main(String[]args){
     ArrayList<Edge>graph[]=new ArrayList[7];
      CreateGraph(graph);
      display(graph);
    boolean vis[]=new boolean[7];
      dfs(graph,vis,0);
    }
}
