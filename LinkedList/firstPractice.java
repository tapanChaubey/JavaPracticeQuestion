package LinkedList;
import java.util.*;
public class firstPractice {
   public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static class LinkedList1 {
       Node head;
       Node tail;
        
        public LinkedList1(){
            head = null;
            tail = null;
        }

        // Add node to the list
        public void add(int val){
            Node node = new Node(val);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        // Print linked list
        public void print(){
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println();
        }

        // Delete node from the list
        public void delete(int key){
            if (head == null) return;

            if (head.data == key) {
                head = head.next;
                return;
            }

            Node curr = head;
            while (curr.next != null && curr.next.data != key) {
                curr = curr.next;
            }

            if (curr.next != null) {
                curr.next = curr.next.next;
            }
        }

        // Check if there is a loop
        public void checkLoop(){
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    System.out.println("Loop is Present !");
                    return;
                }
            }
            System.out.println("Loop is Not Present !");
        }

        // Check if linked list is a palindrome
        public void checkPelindrom(){
            if (head == null || head.next == null) {
                System.out.println("Yes, Palindrom !");
                return;
            }

            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            if (slow.next == null) {  // If only one element in second half
                System.out.println("Yes, Palindrom !");
                return;
            }

            Node node = reverse(slow.next);
            slow.next = null;
            Node curr = head;
            
            while (curr != null && node != null) {
                if (curr.data != node.data) {
                    System.out.println("Not Palindrom !");
                    return;
                }
                curr = curr.next;
                node = node.next;
            }
            System.out.println("Yes, Palindrom !");
        }

        // Reverse a linked list
        public Node reverse(Node node){
            Node curr = node;
            Node prev = null;
            Node forward = null;
            while (curr != null) {
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList1 l1 = new LinkedList1();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            l1.add(num);
        }

        l1.print();
        System.out.println();
        l1.checkPelindrom();
        sc.close();
    }
}
