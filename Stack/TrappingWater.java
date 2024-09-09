package Stack;
import java.util.*;
public class TrappingWater {
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       int sum=0;
       ArrayList<Integer>left=new ArrayList<>();
       ArrayList<Integer>right=new ArrayList<>();
       int max=0;
       for(int i=0; i<arr.length; i++){
          max=Math.max(max, arr[i]);
          left.add(max);
       }
       max=0;
       for(int i=arr.length-1; i>=0; i--){
        max=Math.max(max, arr[i]);
        right.add(max);
     }
     Collections.reverse(right);
     for(int i=0; i<arr.length; i++){
        int min=Math.min(left.get(i),right.get(i));
        sum=sum+min-arr[i];
     }
     System.out.println(sum);



    }
}
