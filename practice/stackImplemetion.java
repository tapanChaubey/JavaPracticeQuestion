package practice;
import java.util.*;
public class stackImplemetion {
    public static class Stack{
         int Size;
         int arr[];
         int i=-1;
         public Stack(int size){
             this.Size=size;
             this.arr=new int[Size];
         }
         public void push(int data){
             if(i==arr.length){
                return;
             }
             arr[++i]=data;
         }
         public int pop(){
             if(i==-1){
                System.out.println("Stack is Empty");
                return -1;
             }
             int data=arr[i--];
             return data;
         }
         public int peek(){
             if(i==-1){
              System.out.println("Stack is Empty");
              return -1;
             }
             return arr[i];
         }
       
    }
    public static void main(String args[]){
          Stack st=new Stack(10);
          st.push(4);
          st.push(5);
          st.push(7);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
