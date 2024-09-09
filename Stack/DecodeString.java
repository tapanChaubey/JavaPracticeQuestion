package Stack;
import java.util.*;
public class DecodeString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
       Stack<Character>st=new Stack<>();
       for(int i=0; i<str.length(); i++){
          char ch=str.charAt(i);
          while(!st.isEmpty() && ch==']'){
            if(st.peek()=='['){
                st.pop();
                break;
            }
            else{
                if(st.peek()>='0'&&st.peek()<='9'){
                 int n=Character.getNumericValue(st.pop());
                 for(int j=1; j<n; j++){
                  str1+=str1;
                 }
                }
                else{
                    str1+=st.pop();
                }
            }
          }
          if(ch!=']'){
            st.push(ch);
          }
       }
       while(!st.isEmpty()){
        if(st.peek()>='0'&&st.peek()<='9'){
            int n=Character.getNumericValue(st.pop());
            System.out.println(n);
            for(int j=1; j<n; j++){
             str1+=str1;
            }
           }
           else{
            str1+=st.pop();
        }
       }
       for(int i=str1.length()-1; i>=0; i--){
        System.out.print(str1.charAt(i));
       }
    }
}
