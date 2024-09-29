package Recursion;
import java.util.*;
public class convertEachNumnerToString {
    static void find(int n,ArrayList<String>arr,ArrayList<String>arr1){
        if(n==0){
            Collections.reverse(arr1);
            System.out.println(arr1);
            return ;
        }
        int num=n%10;
        arr1.add(arr.get(num));
        find(n/10, arr, arr1);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>arr=new ArrayList<>();
        ArrayList<String>arr1=new ArrayList<>();
        arr.add("Zero");
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("four");
        arr.add("five");
        arr.add("six");
        arr.add("seven");
        arr.add("eight");
        arr.add("nice");
        find(n,arr,arr1);
    }
}
