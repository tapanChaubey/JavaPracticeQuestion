package practice;
import java.util.*;
public class QueueImplementions {
    static class Queue{
        int size;
        int rear;
        int front;
        int arr[];
        public Queue(int size){
             this.size=size;
             this.rear=-1;
             this.front=-1;
             this.arr=new int[size];
        }
        public void push(int data){
             if(rear==size){
                 return;
             }
             arr[++rear]=data;
        }
        public int  pop(){
             if(front==size){
                front=-1;
                rear=-1;
                System.out.println("Queue is Empty");
                return -1;
             }
             int data=arr[++front];
             return data;
        }
        
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         Queue q=new Queue(10);
          q.push(3);
          q.push(7);
          q.push(5);
          q.push(6);
          System.out.println(q.pop());
         
    }
}
