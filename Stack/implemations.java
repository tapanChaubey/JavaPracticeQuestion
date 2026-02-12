package Stack;
import java.util.*;
public class implemations {
    public static class myStack{
    ArrayList<Integer>arr=new ArrayList<>();
    int SIZE=10;
     public  boolean isEmpty(){
        return arr.size()==0;
     }
     public void push(int data){
        arr.add(data);
     }
     public  int pop(){
          int data=arr.remove(arr.size()-1);
          return data;
     }
     public  int peek(){
        return arr.get(arr.size()-1);
     }
    }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          myStack st=new myStack();
          st.push(1);
          st.push(2);
          st.push(4);
          
          System.out.println(st.peek());
          System.out.println(st.pop());
   } 
}
