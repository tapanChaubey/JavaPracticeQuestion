package Recursion;
import java.util.*;
public class SumOfN {
    static int PrintSum(int a){
        if(a==0){
            return 0;
        }
        else{
           return PrintSum(a-1)+a;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=PrintSum(n);
        System.out.println(total);
    }

    
}
