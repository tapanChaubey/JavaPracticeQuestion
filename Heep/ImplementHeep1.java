package Heep;
import java.util.*;
public class ImplementHeep1 {
 static ArrayList<Integer>arr=new ArrayList<>();
 public static  void insertfun(int data){
      arr.add(data);
      int x=arr.size()-1;
      int par=(x-1)/2;
      while(x>0 && arr.get(par)>arr.get(x)){
        int temp=arr.get(x);
        arr.set(x,arr.get(par));
        arr.set(par,temp);
        x=par;
        par=(x-1)/2;
      }

  }
public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for(int i=1; i<=n; i++){
          int x=sc.nextInt();
          insertfun(x);
        }
        System.out.println(arr);
    }
}
