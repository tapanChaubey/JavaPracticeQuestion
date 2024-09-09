package ArrayAllQuestion;
import java.util.*;
public class RottedArray {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+"-");
      }
      
      int k=sc.nextInt();
      
      k=n%k;


    //   int arr1[]=new int[n];
    //   int j=0;
    //   for(int i=k; i<arr.length; i++){
    //        arr1[j++]=arr[i];
    //   }
    //   for(int i=0; i<k; i++){
    //     arr1[j++]=arr[i];
    //   }
    //   for(int i=0; i<arr1.length; i++){
    //     System.out.print(arr1[i]+" ");
    //   }
      
      // Optimal Approch  Not taking extra space
    

      for(int i = 0; i < k / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[k - i - 1];
        arr[k - i - 1] = temp;
    }

    // Reverse the remaining elements of the array
    for(int i = k; i < (n + k) / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }

    // Print the modified array
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
      
    }
}
