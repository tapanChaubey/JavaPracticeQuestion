package Pattren;
import java.util.*;
public class triangle {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=1; i<=n; i++){
               int flag=0;
               for(int j=1; j<=i; j++){
                    if(i%2!=0){
                        if(flag==0){
                            System.out.print(1);
                            flag=1;
                        }
                        else{
                            System.out.print(0);
                            flag=0;
                        }
                    }
                    else{
                        if(i%2==0){
                            if(flag==0){
                                System.out.print(0);
                                flag=1;
                            }
                            else{
                                System.out.print(1);
                                flag=0;
                            }
                        }
                    }
                    
               }
               System.out.println();
          }
    }
}
