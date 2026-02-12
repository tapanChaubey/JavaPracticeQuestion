package practice;
import java.util.*;
public class ClimeStair {
     public static int find(int n,int dp[]){
            if(n==1||n==0){
                return 1;
            }
            if(dp[n]!=0){
                return dp[n];
            }
            dp[n]=find(n-1,dp)+find(n-2,dp);
            return dp[n];
     }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int dp[]=new int[n+1];
            System.out.println(find(n,dp));
    }
}
