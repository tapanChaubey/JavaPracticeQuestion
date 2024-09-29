package Queues;
import java.util.*;
import opps.basicopp1;
public class implementAcirculerQueue {
   static class  CirQueue {
    static int size;
    static int rear;
    static int arr[];
    static int front;
    public CirQueue(int d){
        size=d;
        arr=new int[d];
        front=-1;
        rear=-1;
    }
    public static void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full !");
            return ;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=val;
    }
    public static int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
      int result=arr[front];
      if(front==rear){
        front=rear=-1;
      }
      else{
        front=(front+1)%size;
      }
      return result;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    
   }

   public static void main(String []args){
     CirQueue q1=new CirQueue(6);
      q1.enqueue(22);
      q1.enqueue(23);
      q1.enqueue(24);
      q1.enqueue(25);
      q1.enqueue(26);
      q1.enqueue(27);
      q1.dequeue();
      q1.dequeue();
      q1.dequeue();
      q1.dequeue();
      q1.enqueue(28);
      q1.enqueue(29);
      q1.enqueue(30);
      q1.enqueue(31);
      
      while (!q1.isEmpty()) {
        System.out.println(q1.dequeue());
      }

   }  
}
