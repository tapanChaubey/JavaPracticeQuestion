package Heep;
import java.util.*;

public   class popular {
    public static class Node {
      Node left;
      Node right;
      int data;
      public Node(int data){
         this.data=data;
      }
    }
    public static class Bt {
    Node root;
    public Bt(){
        root=null;
    }
    public Node buidTree(ArrayList<Integer>arr1){
        Queue<Node>q=new LinkedList<>();
        Node root=new Node(arr1.get(0));
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<arr1.size()){
             Node curr=q.remove();
             if (i < arr1.size() && arr1.get(i) != -1) {
                curr.left = new Node(arr1.get(i));
                q.add(curr.left);
            }
            i++;

            if (i < arr1.size() && arr1.get(i) != -1) {
                curr.right = new Node(arr1.get(i));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public void printTree(Node root){
        if(root==null){
             return ;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             int size=q.size();
             for(int i=0; i<size; i++){
                 Node curr=q.remove();
                   System.out.print(curr.data+" ");
                   if(curr.left!=null){
                    q.add(curr.left);
                   }
                   if(curr.right!=null){
                    q.add(curr.right);
                   }
             }
             System.out.println();
        }
    }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       ArrayList<Integer> arr1 = new ArrayList<>();
        for (int num : arr) {
            arr1.add(num);
        }
        int size=arr1.size();
        ArrayList<Integer>arr2=new ArrayList<>();
        while (size > 1) {
            for (int i = 0; i < size - 1; i += 2) {
                int sum = arr1.get(i) + arr1.get(i + 1);
                arr2.add(0, sum);
            }

            for (int j = arr2.size() - 1; j >= 0; j--) {
                arr1.add(0, arr2.get(j));
            }
            size = arr2.size();
            arr2.clear();
        }
      Bt b1=new Bt();
      b1.root=b1.buidTree(arr1);
      b1.printTree(b1.root);
    }
}
