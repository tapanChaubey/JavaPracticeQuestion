package ArrayList;
import java.util.*;
public class MonotonicArrayList {
    public static boolean checkMonotonic(ArrayList<Integer>List){
        int c1=0,c2=0;
        for(int i=0; i<List.size()-1; i++){
            if(List.get(i)<List.get(i+1)){
                c1++;
            }
            else if(List.get(i)>List.get(i+1)){
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(c2);

        if(c1==0 && c2>0 || c2==0 && c1>0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            List.add(arr[i]);
        }
        System.out.println(checkMonotonic(List));


    }
    
}
