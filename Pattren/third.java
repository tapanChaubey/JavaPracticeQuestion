package Pattren;
import java.util.*;
public class third {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=0; i<n; i++){
              int k=n-i;
              for(int j=1; j<=k; j++){
                 System.out.print(j);
              }
              for(int j=k+1; j<=n; j++){
                 System.out.print(" ");
              }
              System.out.println();
           }
    } 
}
