package practice;
import java.util.*;
public class StackLinkedList {
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
         public LinkedList(){
            head=null;
         }
         public void push(int val){
            Node node=new Node(val);
             if(head==null){
                head=node;
                return;
             }
             node.next=head;
             head=node;
         }
         public int pop(){
            if(head==null){
                return -1;
            }
            Node temp=head;
            head=head.next;
            int data=temp.data;
            return data;
         }
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
           LinkedList st=new LinkedList();
           st.push(5);
           st.push(6);
           st.push(7);
           System.out.println(st.pop());

         
    }
}
