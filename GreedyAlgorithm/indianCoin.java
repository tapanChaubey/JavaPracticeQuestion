package GreedyAlgorithm;
import java.util.*;
public class indianCoin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int value=sc.nextInt();
        int maxCoin=0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<=value){
            while(arr[i]<=value){
                maxCoin++;
                value=value-arr[i];
            }
        }
        }
        System.out.println(maxCoin);

    }
}
