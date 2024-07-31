package HashMap;
import java.util.*;
public class Frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //int arr[]={1,3,2,5,1,3,1,5,1,5,};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
       // System.out.println(hm);
       Set<Integer>keySet=hm.keySet();
        for (Integer k : keySet){
        if(hm.get(k)>arr.length/3){
            System.out.println("key-"+k+" value-"+hm.get(k));// k=element(key) and hm.get(k)==value
        }

        
       }
    
        
    }
    
}
