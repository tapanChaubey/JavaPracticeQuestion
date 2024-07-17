package HashMap;
import java.util.*;
public class LargestSubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    
        HashMap<Integer,Integer>Lhash=new HashMap<>();
        int len=0;
       int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                len=i+1;
            }
          else  if(Lhash.containsKey(sum)){
                len=Math.max(len,i-Lhash.get(sum));
            }
            else{
                Lhash.put(sum,i);
            }
        }
         System.out.println(len);
    


    }
    
}
