package Pattren;
import java.util.*;
public class secand {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=1; i<=n; i++){
               int  k=n-i;
               for(int j=1; j<=k; j++){
                 System.out.print(" ");
               }
               for(int p=k+1; p<=n; p++){
                   System.out.print("*");
               }
               System.out.println();
           }
           
        
    }  
}
