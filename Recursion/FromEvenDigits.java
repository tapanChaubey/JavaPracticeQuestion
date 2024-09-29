package Recursion;
import java.util.*;
public class FromEvenDigits {
    static int check(int n){
        if(n==0){
            return 0;
        }
        else if(n%2==0){
            return n%10+10*check(n/10);
        }
        else{
           return check(n/10); 
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int newNumber=check(n);
        System.out.println(newNumber);
    }
}
