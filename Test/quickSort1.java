package Test;
import java.util.*;
public class quickSort1 {
    public static int Partitions(int arr[],int l,int r){
         int i=l;
         int pivot=arr[r];
         for(int j=l; j<r; j++){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
         }
         int temp=arr[i];
         arr[i]=pivot;
         arr[r]=temp;
         return i;
    }
    public static void FindSorting(int arr[],int l,int r){
         if(l>=r){
            return;
         }
           int pivoitIdx=Partitions(arr,l,r);
           FindSorting(arr, l, pivoitIdx-1);
           FindSorting(arr, pivoitIdx+1, r);
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
