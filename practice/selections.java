package practice;
import java.util.*;
public class selections {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
          for(int i=0; i<n; i++){
              arr[i]=sc.nextInt();
          }
           for(int i=0; i<n; i++){
             int minIdx=i;
              for(int j=i+1; j<n; j++){
                 if(arr[j]<arr[minIdx]){
                     minIdx=j;
                 }
              }
              int temp=arr[minIdx];
              arr[minIdx]=arr[i];
              arr[i]=temp;
           }
           for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
           }
    }
}
