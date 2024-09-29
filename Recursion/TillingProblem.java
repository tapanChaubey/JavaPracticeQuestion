package Recursion;
import java.util.*;
public class TillingProblem {
    static int find(int n){
        if(n==1|| n==0){
            return 1;
        }
        int num1=find(n-1);
        int num2=find(n-2);
        return num1+num2;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
    }
}
