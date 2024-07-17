package ArrayList;
import java.text.CollationElementIterator;
import java.util.*;
public class Sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>List=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            List.add(arr[i]);
        }
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+"->");
        }
        // assendeing order sorting
        Collections.sort(List);
        System.out.println(List);
        // desending order sorting 
        Collections.sort(List,Collections.reverseOrder());
        System.out.println(List);


    }
    
}
