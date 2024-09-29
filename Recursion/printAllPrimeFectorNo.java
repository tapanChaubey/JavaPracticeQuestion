package Recursion;
import java.util.*;
public class printAllPrimeFectorNo {
    static void FindPrimeNumber(int n,int i){
       if(n<=1){
        return ;
       }
       else if(n%i==0){
          System.out.println(i);
          n=n/i;
          FindPrimeNumber(n, i);
       }
       else{
        FindPrimeNumber(n, i+1);
       }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FindPrimeNumber(n,2);
    }
}
