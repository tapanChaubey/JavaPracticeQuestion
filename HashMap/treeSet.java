package HashMap;
import java.util.*;
public class treeSet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // treeset is store a element in storted order and not sotore a null value
        // in this data structure insert and delete and searching a element 
        // in o(log(n)) time complecesity and store dublicte element
                
        TreeSet<Integer>treeSet=new TreeSet<>();
        for(int i=0; i<arr.length; i++){
            treeSet.add(arr[i]);
        }
        System.out.println(treeSet);
    }


    
}
