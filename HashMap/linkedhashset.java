package HashMap;
import java.util.*;
public class linkedhashset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // Linked_hashset_ is order set .which is store unique element and does not 
        // store dublicate element. and it is manage to sequense ordered
        LinkedHashSet<Integer>Lset=new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            Lset.add(arr[i]);
        }
        for(Integer k:Lset){
            System.out.print(k+" ");
        }
    }
    
}
