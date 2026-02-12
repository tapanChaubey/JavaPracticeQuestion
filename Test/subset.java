package Test;
import java.util.*;
public class subset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0; i<arr.length; i++){
            max=max+arr[i]*arr[i]*arr[i];
            for(int j=i+1; j<arr.length; j++){
               max=max+(int)Math.pow(2,j-i-1)*arr[j]*arr[j]*arr[i];
            }
        }
        System.out.println(max);
    }
}
