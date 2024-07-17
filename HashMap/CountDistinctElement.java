package HashMap;
import java.util.*;
public class CountDistinctElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        // 1.way

        // HashMap<Integer,Integer>map=new HashMap<>();
        // ArrayList<Integer>List=new ArrayList<>();
        // int count=0;
        // for(int i=0; i<arr.length; i++){
        //     if(map.containsKey(arr[i])==false){
        //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        //         List.add(arr[i]);
        //         count++;
        //     }
        //     else{
        //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        //         continue;
        //     }
        // }
        // System.out.println(count);
        // System.out.println(List);
        // 2.way
        // HashSet<Integer>Set=new HashSet<>();
        // for(int i=0; i<arr.length; i++){
        //     Set.add(arr[i]);
        // }
        // System.out.println("Distinct Element :"+Set);
        // System.out.println(Set.size());
        LinkedHashSet<Integer>Lset=new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            Lset.add(arr[i]);
        }
        System.out.println(Lset);

    }
    
}
