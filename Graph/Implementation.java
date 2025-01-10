package Graph;
import java.util.*;
public class Implementation {
    static class Edge {
      int src;
      int dest;
      int wt;
      public Edge(int src,int dest,int wt){
        this.dest=dest;
        this.src=src;
        this.wt=wt;
      }   
    }
     public static void main(String[]args){
       ArrayList<Edge>[] graph = new ArrayList[5];
       for(int i=0; i<5; i++){
         graph[i]=new ArrayList<>();
       }
       graph[0].add(new Edge(0, 1, 1));
       graph[1].add(new Edge(1, 0, 3));
       graph[1].add(new Edge(1, 2, 1));
       graph[1].add(new Edge(1, 3, 6));
       graph[2].add(new Edge(2, 1, 4));
       graph[2].add(new Edge(2, 3, 2));
       graph[3].add(new Edge(3, 1, 4));
       graph[3].add(new Edge(3, 2, 5));
       for(int i=0; i<graph.length; i++){
          for(int j=0; j<graph[i].size(); j++){
        System.out.println("{"+graph[i].get(j).src+","+graph[i].get(j).dest+"}-"+graph[i].get(j).wt);
          }
       }        
     }
}