package practice;

import java.util.Scanner;

import SortingAlgorithem.Merge;

public class first {
    public static void Sorting(int arr[],int l,int mid,int r){
          int a[]=new int[r-l+1];
          int k=0;
          int i=l;
          int j=mid+1;
          while(i<=mid && j<=r){
             if(arr[i]<arr[j]){
                a[k++]=arr[i++];
             }
             else{
                a[k++]=arr[j++];
             }
          }
          while(i<=mid){
            a[k++]=arr[i++];
          }
          while(j<=r){
             a[k++]=arr[j++];
          }
          k=0;
          for(int p=l; p<=r; p++){
            arr[p]=a[k++];
          }
    }
    public static void MergeSort(int arr[],int l,int r){
         if(l>=r){
             return;
         }
         int mid=l+(r-l)/2;
         MergeSort(arr, l, mid);
         MergeSort(arr, mid+1, r);
         Sorting(arr,l,mid,r);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
        }
         MergeSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
    }
}
