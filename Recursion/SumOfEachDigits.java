package Recursion;
import java.util.*;
public class SumOfEachDigits {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return sum(n/10)+n%10;
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); 
    int total=sum(n);
    System.out.println(total);

}
    
}
