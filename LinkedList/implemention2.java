package LinkedList;
import java.util.*;
public class implemention2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            ll.insertAtEnd(i);
        }
        ll.display();

    }
    
}
class Node{
    int data;
    Node next;
  public  Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    LinkedList(){
        head=null;
        tail=null;
    }
    public void insertAtEnd(int value){
        Node node=new Node(value);
        if(head==null){
            head=tail=node;
            return;
        }
        else{
            tail.next=node;
            tail=node;
            return ;
        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
