package Graph;
import java.util.*;
public class HashPath {
    static class Edge{
        int dest;
        int src;
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
         graph[1].add(new Edge(1, 0, 1));
         graph[1].add(new Edge(1, 3, 1));
         graph[1].add(new Edge(0, 2, 1));
         graph[2].add(new Edge(2, 0, 1));
         graph[2].add(new Edge(2, 1, 1));
         graph[2].add(new Edge(2, 4, 1));
         graph[3].add(new Edge(3, 1, 1));
         graph[3].add(new Edge(3, 5, 1));
         graph[3].add(new Edge(3, 4, 1));
         graph[4].add(new Edge(4, 2, 1));
         graph[4].add(new Edge(4, 3, 1));
         graph[4].add(new Edge(4, 5, 1));
         graph[5].add(new Edge(5, 3, 1));
         graph[5].add(new Edge(5, 4, 1));


    }
    static void display(ArrayList<Edge>graph[]){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                System.out.println(graph[i].get(j).src+","+graph[i].get(j).dest);
            }
        }
    }
   static boolean CheckHashPath(ArrayList<Edge>graph[],boolean vis[],int src,int dest){
      if(src==dest){
        return true;
      }
      vis[src]=true;
       for(int j=0; j<graph[src].size(); j++){
         Edge e=graph[src].get(j);
         if(!vis[e.dest] && CheckHashPath(graph, vis, e.dest, dest)){
            return true;
         }
       }
       return false;
   }
    public static void main(String[]args){
        boolean vis[]=new boolean[8];
        ArrayList<Edge>graph[]=new ArrayList[8];
        CreateGraph(graph);
        display(graph);
        System.out.println(CheckHashPath(graph,vis,0,5));
    }
}
