package Heep;
import java.util.*;
public class deleteElementInHeep {
    static class Heep {
    ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data){
          arr.add(data);
          int x=arr.size()-1;
          int par=(x-1)/2;
    while(x>0 && arr.get(par)>arr.get(x)){     
        int temp=arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par,temp);
        x=par;
        par=(x-1)/2;
    }
  
}
public void Heepify(int i){
    int min=i;
    int left=2*i+1;
    int right=2*i+2;
    if(left<arr.size() && arr.get(min)>arr.get(left)){
        min=left;
    }
    if(right<arr.size() && arr.get(min)>arr.get(right)){
        min=right;
    }
    if(min!=i){
        int temp=arr.get(i);
        arr.set(i,arr.get(min));
        arr.set(min,temp);
        Heepify(min);
    }
}


public void remove(int idx){
     /// swap element at last element
      int temp=arr.get(idx);
      arr.set(idx, arr.get(arr.size()-1));
      arr.set(arr.size()-1,temp);
      arr.remove(arr.size()-1);
      // calling heepify
      Heepify(idx);
}

}
 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Heep pq=new Heep();
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
             pq.add(x);
        }
        System.out.println(pq.arr);
        int k=sc.nextInt();
         pq.remove(k);
       System.out.println(pq.arr);

    }
}
