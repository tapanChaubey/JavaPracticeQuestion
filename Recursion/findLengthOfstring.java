package Recursion;
import java.util.*;
public class findLengthOfstring {
    static void find(String str,int count){
        if(str.equals("")){
            System.out.println(count);
            return ;
        }
        find(str.substring(1),count+1);
    } 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="Tapankumar";
        find(str,0);
    }
}
