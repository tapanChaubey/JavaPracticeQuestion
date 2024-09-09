package ArrayAllQuestion;
import java.util.*;
public class secandLargest {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"-");
        }
        int max1=arr[0];
        int max2=arr[0];
     
        for(int i=0; i<arr.length; i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max1>arr[i] && max2<arr[i]){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        //kth largest number
        int k=sc.nextInt();
        for(int i=0; i<k; i++){
           int max=0;
            for(int j=0; j<arr.length; j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            for(int j=0; j<arr.length; j++){
                if(max==arr[j]){
                    arr[j]=0;
                }
            }
        }
        int kth=arr[0];
        for(int i=0; i<arr.length; i++){
           if(kth<arr[i]){
            kth=arr[i];
           }
        }
        System.out.println(kth);
    }
    
}
