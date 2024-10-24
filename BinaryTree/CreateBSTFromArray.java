package BinaryTree;
import java.util.*;
public class CreateBSTFromArray {
 
   static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
   static class tree{
        static Node CreatBst(int arr[],int st,int end){
            if(st>end){
             return null;
            }
            int mid=st+(end-st)/2;
            Node root=new Node(arr[mid]);
            root.left=CreatBst(arr, st, mid-1);
            root.right=CreatBst(arr, mid+1, end);
            return root;
         }
         static void printNode(Node root){
             if(root==null){
                 return;
             }
             printNode(root.left);
             System.out.print(root.data+" ");
             printNode(root.right);
         }



    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        tree bt=new tree();
       Node root= bt.CreatBst(arr,0,n-1);
        bt.printNode(root);
    }
}
