package ArrayList;
import java.util.*;
public class pairSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        int l=0,r=arr.length-1;
        int count=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                count=1;
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
       if(count==1){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }

    }
    
}
