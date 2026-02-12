package Stack;
import java.util.*;
public class stocksSpanProblem {
    public static void findSpan(int stocks[],int span[]){
           Stack<Integer>st=new Stack<>();
            st.push(0);
            span[0]=1;
            int j=1;
            for(int i=1; i<stocks.length; i++){
                while(!st.isEmpty()&&stocks[st.peek()]<stocks[i]){
                     st.pop();
                }
                if(st.isEmpty()){
                    span[j++]=1;
                }
                else{
                    int privious=st.peek();
                     span[j++]=i-privious;
                }
                st.push(i);
            }  
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int stocks[]=new int[n];
          int span[]=new int[n];
          for(int i=0; i<n; i++){
             stocks[i]=sc.nextInt();
          }
          findSpan(stocks,span);
          for(int i=0; i<span.length; i++){
             System.out.println(span[i]+" ");
          }
     }
}
