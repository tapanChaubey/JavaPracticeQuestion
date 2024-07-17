package ArrayList;
import java.util.*;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
        ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Integer>List2=new ArrayList<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            List1.add(arr[i]*2);
            List2.add(arr[i]*3);
        }
        MainList.add(List1);
        MainList.add(List2);
       // System.out.print(MainList);
        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer>curr=MainList.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+"-");
            }
            System.out.println();
        }
    }

    
}
