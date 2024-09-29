package SortingAlgorithem;
import java.util.*;
public class QuickSort {
    static int Partitions(int arr[],int si,int ei){
        int peviElement=arr[ei];
        int i=si-1;
       for(int j=si; j<ei; j++){
        if(arr[j]<=peviElement){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
       }
       i++;
       int temp=peviElement;
       arr[ei]=arr[i];
       arr[i]=temp;
       return i;
    }
    static void QuickSort1(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int piviIndex=Partitions(arr,si,ei);
        QuickSort1(arr, si, piviIndex-1);
        QuickSort1(arr, piviIndex+1, ei);
    }
    static void printArray(int arr[]){
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
        QuickSort1(arr,0,arr.length-1);
        printArray(arr);
    }
}
