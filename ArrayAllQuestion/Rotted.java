package ArrayAllQuestion;

import java.util.Scanner;

public class Rotted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "-");
        }
        System.out.println(); 
        int k = sc.nextInt();
        for(int i = 0; i < k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;
        }
        int start = k;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < arr.length/2; i++) {
           int temp=arr[i];
           arr[i]=arr[n-1-i];
           arr[n-1-i]=temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
}
}
