package ArrayList;
import java.util.*;
public class input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            list.add(arr[i]);
        }

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }


    }
    
}
