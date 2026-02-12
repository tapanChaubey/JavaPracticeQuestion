package SortingAlgorithem;
import java.util.*;
 public class HeepSort {
    static class Heep {
        ArrayList<Integer>arr=new ArrayList<>();
        public void insert(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(x > 0 && arr.get(x) < arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public void print(){
            System.out.println(arr);
        }
        public void delete(){
               if(arr.size()==0){
                 return;
               }
              int temp=arr.get(arr.size()-1);
              arr.set(0,temp);
              arr.remove(arr.size()-1);
              heepify(0);
        }
        public void heepify(int idx){
              int left=2*idx+1;
              int right=2*idx+2;
              int minIdx=idx;
              if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
              }
              if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
              }
              if(minIdx!=idx){
                 int temp=arr.get(idx);
                 arr.set(idx,arr.get(minIdx));
                 arr.set(minIdx,temp);
                 heepify(minIdx);
              }
        }
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         Heep h1=new  Heep();
          int n=sc.nextInt();
          for(int i=1; i<=n; i++){
              int data=sc.nextInt();
               h1.insert(data);
          }
          h1.print();
          h1.delete();
          h1.print();

    }
}
