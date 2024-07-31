package HashMap;
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>List=new ArrayList<>();
        int target=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            int sum=target-arr[i];
            if(hm.containsKey(sum)){
                List.add(hm.get(sum));
                List.add(i);
                break;
            }
            hm.put(arr[i],i);
        }
        System.out.println(List);
    }

    
}
