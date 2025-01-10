package Graph;
import java.util.*;
public class CycleDetections {
    static class Edge{
        int dest;
        int src;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    static void CreateGraph(ArrayList<Edge>graph[]){
         for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
         }
         graph[0].add(new Edge(0, 1));
         graph[0].add(new Edge(0, 2));
         graph[1].add(new Edge(1, 0));
         graph[1].add(new Edge(1, 2));
         graph[2].add(new Edge(2, 0));
         graph[2].add(new Edge(2, 1));
         graph[2].add(new Edge(2, 4));
         graph[3].add(new Edge(3, 4));
         graph[3].add(new Edge(3, 1));
         graph[4].add(new Edge(4, 3));
         graph[4].add(new Edge(4, 2));
    }
    static void display(ArrayList<Edge>graph[]){
         for(int i=0; i<graph.length; i++){
             for(int j=0; j<graph[i].size(); j++){
                 System.out.println(graph[i].get(j).src+","+graph[i].get(j).dest);
             }
         }
    }
    static boolean checkCycle(ArrayList<Edge>graph[]){
         boolean vis[]=new boolean[graph.length];
          for(int i=0; i<graph.length; i++){
                if(!vis[i]){
                    if(detecteCycle(graph,vis,i,-1)){
                       return true;
                    }
                }
          }
          return false;
    }
    static boolean detecteCycle(ArrayList<Edge>graph[], boolean vis[],int curr,int par){
           vis[curr]=true;
           for(int j=0; j<graph[curr].size(); j++){
             Edge e=graph[curr].get(j);
              if(!vis[e.dest] && detecteCycle(graph, vis, e.dest, curr)){
                 return true;
              }
              else if(vis[e.dest] && curr!=par){
                 return true;
              }
           }
           return false;
    }
    public static void main(String []args){
       ArrayList<Edge>graph[]=new ArrayList[6];
       CreateGraph(graph);
       display(graph);
       System.out.println(checkCycle(graph));
    }
}
