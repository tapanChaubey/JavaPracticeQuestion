package Recursion;
import java.util.*;
public class findAllOcarance {
    static void AllIndex(int arr[],int idx,int key,ArrayList<Integer>list){
        if(arr.length==idx){
            System.out.println(list);
            return;
        }
       if(arr[idx]==key){
        list.add(idx);
        AllIndex(arr, idx+1, key, list);
       }
       else{
      AllIndex(arr, idx+1, key, list);
       }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        
        AllIndex(arr,0,key,new ArrayList<>());
    }
}
