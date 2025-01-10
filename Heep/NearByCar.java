package Heep;
import java.util.*;
public class NearByCar {
    static class  Point implements Comparable<Point> {
       int x;
       int y;
       int dis;
       public Point(int x,int y,int dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
       }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int pte[][]=new int[n][2];
         for(int i=0; i<n; i++){
             for(int j=0; j<2; j++){
                pte[i][j]=sc.nextInt();
             }
         }

           
    }
}
