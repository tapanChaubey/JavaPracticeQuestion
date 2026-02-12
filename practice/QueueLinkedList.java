package practice;
import java.util.*;

import HashMap.linkedhashset;
public class QueueLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
             this.data=data;
              this.next=null;
        }
    
    }
    static class LinkedList{
        Node head;
        Node tail;
        public LinkedList(){
            head=null;
            tail=null;
        }
        public void push(int val){
          Node node=new Node(val);
          if(head==null){
             head=tail=node;
             return;
          }
          else{
             tail.next=node;
             tail=node;
          }
        }
        public int  pop(){
             if(head==null){
                System.out.println("Queue is Empty");
                return -1;
             }
             int data=head.data;
             head=head.next;
             return data;
        }
    }
    public static void main(String args[]){
        LinkedList q=new LinkedList();
        q.push(5);
        q.push(1);
        q.push(7);
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
