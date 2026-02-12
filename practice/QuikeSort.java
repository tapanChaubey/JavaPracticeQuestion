package practice;
import java.util.*;
public class QuikeSort {
    public  static int partition(int arr[],int l,int r){
            int pivot=arr[r];
             int i=l;
             for(int j=l; j<r; j++){
                 if(arr[j]<=pivot){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                 }
             }
       int temp=pivot;
       arr[r]=arr[i];
       arr[i]=temp;
       return i;
    }
       public static void QuikeSortAlgo(int arr[],int l,int r){
           if(l>=r){
              return ;
           }
           int pivotIdx=partition(arr,l,r);
            QuikeSortAlgo(arr, l, pivotIdx-1);
            QuikeSortAlgo(arr, pivotIdx+1, r);
       }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         QuikeSortAlgo(arr,0,arr.length-1);
         for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
         }
    }
}
