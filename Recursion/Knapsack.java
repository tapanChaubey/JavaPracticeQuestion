package Recursion;
import java.util.*;
public class Knapsack {
   static int Find(int wt[],int value[],int cap,int n,int dp[][]){
       if(n==0||cap==0){
        return 0;
       }
       if(dp[n-1][cap]!=-1){
         return dp[n-1][cap];
       }
       if(cap>=wt[n-1]){
        int ans1=value[n-1]+Find(wt, value, cap-wt[n-1], n-1,dp);
        int ans2=Find(wt, value, cap, n-1,dp);
        dp[n-1][cap]= Math.max(ans1,ans2);
        return dp[n-1][cap];
       }
       else{
         dp[n-1][cap]=Find(wt, value, cap, n-1,dp);
         return dp[n-1][cap];
       }
   } 
   public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int value[]=new int[n];
      int wt[]=new int[n];
      for(int i=0; i<n; i++){
          value[i]=sc.nextInt();
          wt[i]=sc.nextInt();
      }
      int cap=sc.nextInt();
      int dp[][]=new int[n+1][cap+1];
      for(int i=0; i<dp.length; i++){
        for(int j=0; j<cap+1; j++){
         dp[i][j]=-1;
        }
      }
      System.out.println(Find(wt,value,cap,n,dp));
   } 
}
