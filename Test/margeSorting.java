package Test;
import java.util.*;
public class margeSorting {
    public static void MargeSorting(int arr[],int l,int mid,int r){
         int arr1[]=new int[r-l+1];
         int i=l;
         int j=mid+1;
         int k=0;
         while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                arr1[k++]=arr[i++];
            }
            else{
              arr1[k++]=arr[j++];
            }
         }
         while(i<=mid){
            arr1[k++]=arr[i++];
         }
         while(j<=r){
            arr1[k++]=arr[j++];
         }
          k=l;
         for(int p=0; p<arr1.length; p++){
            arr[k++]=arr1[p];
         }
    }
    public static void FindSorting(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        FindSorting(arr, l, mid);
        FindSorting(arr, mid+1, r);
        MargeSorting(arr,l,mid,r);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
         }
         FindSorting(arr,0,arr.length-1);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }

    }
}
