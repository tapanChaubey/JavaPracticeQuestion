package practice;
import java.util.*;
public class knapshak {
    public static int find(int wt[],int val[],int dp[][],int cap,int n){
         if(cap==0 || n==0){
             return 0;
         }
         if(dp[n][cap]!=-1){
             return dp[n][cap];
         }
         else if(cap>=wt[n-1]){
             int ans1=val[n-1] + find(wt, val, dp, cap - wt[n-1], n - 1);
             int ans2=find(wt, val, dp, cap, n-1);
             dp[n][cap]=Math.max(ans1,ans2);
             return dp[n][cap];
         }
         else{
           dp[n][cap]=find(wt, val, dp, cap, n-1);
           return dp[n][cap];
         }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int wt[]={2,5,1,3,4};
        int val[]={15,14,10,45,30};
        int n=val.length;
        int cap=sc.nextInt();
        int dp[][]=new int[n+1][cap+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=cap; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(find(wt,val,dp,cap,n));
    }
}
