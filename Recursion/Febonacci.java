package Recursion;
import java.util.*;
public class Febonacci {
    static int Find(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Find(n-1)+Find(n-2);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(Find(n));
    }
    
}
