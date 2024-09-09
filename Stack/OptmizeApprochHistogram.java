package Stack;
import java.util.*;
public class OptmizeApprochHistogram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer>st=new Stack<>();
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        // for left
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        // for right
        st=new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=-1;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<left.length; i++){
            System.out.print(left[i]+" ");
        }
        // System.out.println();
        // for(int i=0; i<right.length; i++){
        //     System.out.print(right[i]+" ");
        // }
        // int max=0;
        // for(int i=0; i<arr.length; i++){
        //   int wid=right[i]-left[i]-1;
        //   int area=wid*arr[i];
        //   max=Math.max(max, area);
        // }
        // System.out.println(max);
    }
}
