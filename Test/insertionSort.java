package Test;
import java.util.*;
public class insertionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<arr.length; i++){
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>curr){
                 arr[prev+1]=arr[prev];
                 prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
