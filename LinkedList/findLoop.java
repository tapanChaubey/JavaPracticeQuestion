package LinkedList;
import java.util.*;
public class findLoop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList1 ll=new LinkedList1();
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            ll.insertAtHead(x);
        }
        ll.display();
       //System.out.println(ll.findLoop());
    }
    
}
class Node{
    int data;
    Node next;
 public   Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList1{
    Node head;
   public LinkedList1(){
    head=null;
    }
  public  void insertAtHead(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            return;
        }
        else{
            node.next=head;
            head=node;
            return ;
        }

    }
    // public Boolean findLoop(){
    //     Node slow=head;
    //     Node fast=head;
    //     if(head==null|| head.next==null){
    //         return false;
    //     }
    //     while(fast!=null && fast.next!=null){
    //         fast=fast.next.next;
    //         slow=slow.next;
    //         if(slow==fast){
    //             return true;
    //         }
    //     }
    //     return false;
   // }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
    }

}
