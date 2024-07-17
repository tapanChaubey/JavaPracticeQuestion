package ArrayList;
import java.util.*;
public class Dublicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            List.add(arr[i]);
        }
        
        for(int i=0; i<List.size(); i++){
            for(int j=i+1; j<List.size(); j++){
                if(List.get(i).equals(List.get(j))){
                    List.remove(List.get(j));
                }
            }
        }
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+" ");
        }

    }
    
}
