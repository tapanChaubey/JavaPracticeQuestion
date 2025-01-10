package Graph;
import java.util.*;
public class BFS2 {
    public static class Edge {
      int src;
      int dest;
      int wt;
    public Edge(int src,int dest,int wt){
         this.src=src;
         this.dest=dest;
         this.wt=wt;
       }
    }
    static void Bfs(ArrayList<Edge>graph[]){
         Queue<Integer>q=new LinkedList<>();
         boolean vis[]=new boolean[graph.length];
         q.add(0);
         while(!q.isEmpty()){
              int curr=q.remove();
              if(!vis[curr]){
                 System.out.print(curr+"->");
                 vis[curr]=true;
                  for(int j=0; j<graph[curr].size(); j++){
                      Edge data=graph[curr].get(j);
                      q.add(data.dest);
                  }
              }
         }
    }
    public static void main(String []args){
      ArrayList<Edge>graph[]=new ArrayList[7];
       for(int i=0; i<graph.length; i++){
         graph[i]=new ArrayList<>();
       }
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));
        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));
        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));
        graph[5].add(new Edge(5, 6, 0));
        graph[6].add(new Edge(6, 5, 0));
        for(int i=0; i<graph.length; i++){
             for(int j=0; j<graph[i].size(); j++){
                 Edge data=graph[i].get(j);
                 System.out.println(data.src+"->"+data.dest+"->");
             }
        }
       Bfs(graph);
    }
}