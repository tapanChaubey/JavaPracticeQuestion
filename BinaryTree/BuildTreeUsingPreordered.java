package BinaryTree;

import java.util.*;

public class BuildTreeUsingPreordered {
   static class Node{
     int data;
     Node left;
     Node right;
      public Node(int val){
        this.data=val;
        left=null;
        right=null;
      }
   }
   static class BinaryTree{
    Node root;
   static int i=-1;
    public BinaryTree(){
        root=null;
    }
    public Node buildTree(int arr[]){
        i++;
        if(arr[i]==-1){
            return null;
        }
        Node node=new Node(arr[i]);
        node.left=buildTree(arr);
        node.right=buildTree(arr);
        return node;
    }
    public void display(Node root){
    if(root==null){
        return ;
    }
    System.out.println(root.data);
    display(root.left);
    display(root.right);

    }
   }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        BinaryTree tree=new BinaryTree();
      Node root=tree.buildTree(arr);
      tree.display(root);


    }
}
