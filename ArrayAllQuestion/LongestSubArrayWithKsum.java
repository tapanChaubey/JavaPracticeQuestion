package ArrayAllQuestion;
import java.util.*;
public class LongestSubArrayWithKsum{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int len=0;
        int max=0;
        int sum=0;
        int k=sc.nextInt();
         for(int i=0; i<n; i++){
              int val=sum-k;
              sum+=arr[i];
              if(k==sum){
                 len=i+1;
                }
             else if(map.containsKey(val)){
                len=Math.max(len,i-map.get(i));
             }
              map.put(sum,i);
            }
         System.out.print(len);
     }    
}
