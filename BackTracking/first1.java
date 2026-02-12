package BackTracking;
import java.util.*;
public class first1 {
    static void insert(int arr[],int n,int idx){
        if(idx==n){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
         arr[idx]=idx+1;
        insert(arr, n, idx+1);
        arr[idx]-=2;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        insert(arr,n,0);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
