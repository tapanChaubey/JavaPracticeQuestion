package Recursion;
import java.util.*;
public class PrintNoDecresingOrder {
    static int pass(int n){
        if(n==0){
            return 0;
        }
        else{
            System.out.print(n+" ");
            return pass(n-1);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pass(n);
    }
}
