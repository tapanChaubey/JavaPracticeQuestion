package Queues;
import java.util.*;
public class usingLinkedList {
  static  class Node{
        int data;
        Node next;
    public Node(int d){
        data=d;
        next=null;
    }
    }
static class LL{
    Node head;
    Node tail;
    public LL(){
        head=null;
        tail=null;
    }
 public void insert(int val){
    Node node=new Node(val);
    if(head==null){
        head=tail=node;
        return;
    }
    tail.next=node;
    tail=node;
 }

public int dequeue(){
    if(head==null){
        return -1;
    }
    int result=head.data;
    head=head.next;
    return result;
}

public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
}
 public static void main(String[]args){
   LL q1=new LL();
   q1.insert(22);
   q1.insert(23);
   q1.insert(24);
   q1.insert(25);
   q1.insert(26);
   q1.insert(27);
   q1.insert(28);
   q1.insert(29);
   while(q1.head!=null && q1.tail!=null){
    System.out.print(q1.dequeue()+" ");
   }
  
   
   
    
 }
    
}
