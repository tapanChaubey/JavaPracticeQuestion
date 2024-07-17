package LinkedList;
import java.util.*;

public class Implementation1 {

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList1 {
        public Node head;

        public LinkedList1() {
            head = null;
        }

        void insertAtHead(int v) {
            Node node = new Node(v);
            if (head == null) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null"); 
        }
    }

    public static void main(String[] args) {
        Implementation1 impl = new Implementation1();
        LinkedList1 ll = impl.new LinkedList1(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            ll.insertAtHead(i);
        }
        ll.display();
        sc.close();
    }
}
