package Recursion;
import java.util.*;

public class reverseAnArray {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void pass(int l,int arr[],int n){
        if(l>=n/2){
            return;
        }
        else{
            swap(arr,l,n-l-1);
             pass(l+1,arr,n);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        pass(0,arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
