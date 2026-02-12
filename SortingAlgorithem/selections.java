package SortingAlgorithem;
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
                   int min=i;
                   int count=0;
                 for(int j=i+1;j<n; j++){
                      if(arr[min]>arr[j]){
                         min=j;
                         count++;
                      }
                 }
                 int temp=arr[i];
                 arr[i]=arr[min];
                 arr[min]=temp;
                 System.out.println(count);
            }
            for(int i=0; i<arr.length; i++){
                 System.out.print(arr[i]+" ");
            }
      }
}
