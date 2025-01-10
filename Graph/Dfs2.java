package Graph;

import java.util.ArrayList;

public class Dfs2 {
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
      public static void CreatDfs(ArrayList<Edge>graph[],boolean vis[],int curr){
              System.out.print(curr+"->");
              vis[curr]=true;
              for(int i=0; i<graph[curr].size(); i++){
                 Edge data=graph[curr].get(i);
                  if(!vis[data.dest]){
                    CreatDfs(graph, vis, data.dest);
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
        // for(int i=0; i<graph.length; i++){
        //      for(int j=0; j<graph[i].size(); j++){
        //          Edge data=graph[i].get(j);
        //          System.out.println(data.src+"->"+data.dest+"->");
        //      }
        // }
        boolean vis[]=new boolean[7];
        CreatDfs(graph,vis,0);
    }
}
