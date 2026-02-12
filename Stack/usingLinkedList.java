package Stack;
import java.util.*;
public class usingLinkedList {
    public static class  Node {
         Node head;
         Node tail;
         Node next;
         int data;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static class listlinked{
        Node head;
        Node tail;
        public listlinked(){
            head=null;
            tail=null;
        }
        public  boolean isEmpty(){
           return head==null;
        }
        public int pop(){
            if(head==null){
                return -1;
            }
            Node n=head;
            head=head.next;
            return n.data;
        }
        public void push(int val){
            Node n=new Node(val);
            n.next=head;
            head=n;
        }
        public int peek(){
            if(head==null){
                return -1;
            }
            int d=head.data;
            return d;
        }
    }
    public static void main(String args[]){
           listlinked l1=new listlinked();
            l1.push(1);
            l1.push(2);
            l1.push(3);
            l1.push(4);
            System.out.println(l1.peek());
            System.out.println(l1.pop());
            System.out.println(l1.pop());
    } 
}
