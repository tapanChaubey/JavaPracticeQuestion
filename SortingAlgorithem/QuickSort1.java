package SortingAlgorithem;
import java.util.*;
public class QuickSort1 {
    static int Partitions(int arr[],int si,int ei){
          int pivot=arr[ei];
          int i=si;
          for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
          }
       int temp=pivot;
       arr[ei]=arr[i];
       arr[i]=temp;
       return i;
    }
     static void QuickSort(int arr[],int si,int ei){
         if(ei<=si){
            return;
         }
         int pivoitIdx=Partitions(arr,si,ei);
         QuickSort(arr,si,pivoitIdx-1);
         QuickSort(arr,pivoitIdx+1,ei);
     }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt(); 
         }
         QuickSort(arr,0,arr.length-1);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
    }
    
}
