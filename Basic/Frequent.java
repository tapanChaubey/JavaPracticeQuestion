package Basic;
import java.util.*;
public class Frequent {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        LinkedHashMap<Integer,Integer>Lhash=new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            if(Lhash.containsKey(arr[i])){
                Lhash.put(arr[i],Lhash.get(arr[i])+1);
            }
            else{
                Lhash.put(arr[i],1);
            } 
        }
        Set<Integer>k=Lhash.keySet();
        int max=0,r=0;
        for(Integer i:k){
            if(max<=Lhash.get(i)){
                max=Lhash.get(i);
                r=i;
            }
        }
        System.out.println(max);
        System.out.println(r);
    }
    
}
