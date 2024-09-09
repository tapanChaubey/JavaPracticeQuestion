package Stack;
import java.util.*;
public class nextGreater {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int arr1[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                arr1[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            arr1[st.peek()]=-1;
            st.pop();
        }
        System.out.println();
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
