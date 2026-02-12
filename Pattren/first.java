package Pattren;
import java.util.*;
public class first {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
             for(int j=1; j<=n; j++){
                  if(i==1 || j==1){
                     if(j==n){
                        System.out.print("*");
                     }
                     else{
                        System.out.print("*"+" ");
                     }
                  } 
                  else if(i==n||j==n)  {
                      if(j==n){
                        System.out.print("*");
                      }
                      else{
                        System.out.print("*"+" ");
                      }
                  }
                  else{
                    System.out.print("  ");
                  }
             }
             System.out.println();
        }
     }
}
