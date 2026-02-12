package DP;
import java.util.*;
public class KnapsackProblem {
    public static int find(int wt[],int val[],int wait,int dp[][],int n){
          if(n==0||wait==0){
              return 0;
          }
          if(dp[n][wait]!=0){
             return dp[n][wait];
          }
          if(wait>=wt[n-1]){
              int ans1=val[n-1]+find(wt, val, wait-wt[n-1], dp, n-1);
              int ans2=find(wt, val, wait, dp, n-1);
              dp[n][wait]=Math.max(ans1,ans2);
              return dp[n][wait];
          }
          else{
              dp[n][wait]=find(wt, val, wait, dp, n-1);
            return dp[n][wait];
          }
        }
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int wt[]=new int[n];
          int val[]=new int[n];
          for(int i=0; i<n; i++){
              wt[i]=sc.nextInt();
            }
          for(int i=0; i<n; i++){
             val[i]=sc.nextInt();
            }
           int wait=sc.nextInt();
           int dp[][]=new int[n+1][wait+1];
           int ans=find(wt,val,wait,dp,n);
           System.out.println(ans);

           
      }
}
