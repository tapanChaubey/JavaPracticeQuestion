package Queues;
import java.util.*;
public class ImplemetionsWithArray {
   static class Queue{
       static int size;
       static int arr[];
       static int rear;
      public Queue(int d){
         this.size=d;
         arr=new int[d];
         rear=-1;
      }
 public static void enqueue(int val){
    if(rear==size-1){
        System.out.println("Queue is full");
        return;
    }
    arr[++rear]=val;
 }
 public static int dequeue(){
    if(isEmpty()){
        return -1;
    }
    int front=arr[0];
    for(int i=0; i<rear; i++){
        arr[i]=arr[i+1];
    }
     rear=rear-1;
    return front;
 }
 public static boolean isEmpty(){
   return rear==-1;
 }

public static int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
   return arr[0];
}

}
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       Queue q1=new Queue(5);
       q1.enqueue(22);
       q1.enqueue(23);
       q1.enqueue(24);
       q1.enqueue(26);
       q1.enqueue(28);
       while(!q1.isEmpty()){
         System.out.println(q1.peek());
         q1.dequeue();

       }


    }
}
