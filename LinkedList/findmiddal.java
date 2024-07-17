package LinkedList;
import java.util.*;
public class findmiddal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        findmiddal f1=new findmiddal();
        LinkedList ll=f1.new LinkedList();
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            ll.insertAtEnd(i);
        }
    int value=ll.mid1();
    ll.display();
    System.out.println();
    System.out.println(value);


    }
    class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    class LinkedList{
        Node head;
        public LinkedList(){
            head=null;
        }
        void insertAtEnd(int v){
            Node node=new Node(v);
            if(head==null){
                head=node;
                return ;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            return;

        }
        int  mid1(){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
    
}
