package Graph;
import java.util.*;
public class CreateGraph {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static  void Create1(ArrayList<Edge>graph[]){
         for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
         }
         graph[0].add(new Edge(0, 1, 2));
         graph[1].add(new Edge(1, 0, 2));
         graph[1].add(new Edge(1, 2, 3));
         graph[1].add(new Edge(1, 4, 5));
         graph[2].add(new Edge(2, 1, 3));
         graph[2].add(new Edge(2, 3, 4));
         graph[3].add(new Edge(3, 2, 4));

    }
    public static void main(String args[]){
         ArrayList<Edge>graph[]=new ArrayList[4];
         Create1(graph);
         for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                 Edge data=graph[i].get(j);
               System.out.println(data.src+"->"+data.dest+"->"+data.wt);
            }
         }


    } 
}
