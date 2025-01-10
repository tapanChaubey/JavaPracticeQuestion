package SortingAlgorithem;
import java.util.*;
public class Merge {
    static void mergeArray(int arr[],int si,int mid,int ei){
    int i=si;
    int j=mid+1;
    int temp[]=new int[ei-si+1];
    int k=0;
    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
        }
        else{
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    int p=si;
    for(int r=0; r<temp.length;r++){
        arr[p++]=temp[r];
    }
}
static void mergeSort(int arr[],int si,int ei){
     if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);
    mergeArray(arr,si,mid,ei);
 }
static void printarr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int end=arr.length-1;
        mergeSort(arr,0,end);
        printarr(arr);
    }
}
