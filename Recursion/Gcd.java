package Recursion;

import java.util.Scanner;

public class Gcd {
  static  int FindOfGcd(int a,int b){
        if(a==b){
            return a;
        }
        else if(a>b){
            return FindOfGcd(a-b, b);
        }
        else{
            return FindOfGcd(b-a, a);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int num=FindOfGcd(a,b);
       System.out.println(num);

    }
}
