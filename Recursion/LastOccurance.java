import java.util.*;
public class LastOccurance {
    public static int check(int arr[],int i,int k){
        if(i==-1){
            return -1;
        }
        else if(arr[i]==k){
            return i;
        }
        else{
            return check(arr, i-1, k);
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(check(arr,arr.length-1,k));
    }
}

