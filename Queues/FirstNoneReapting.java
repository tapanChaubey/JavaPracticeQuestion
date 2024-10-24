package Queues;
import java.util.*;
public class FirstNoneReapting {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        Queue<Character>q1=new LinkedList<>();
        StringBuilder st=new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            q1.add(ch);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
          if(map.get(q1.peek())==1){
            st.append(q1.peek());
          }
          else{
            while(!q1.isEmpty() && map.get(q1.peek())!=1){
                q1.remove();
            }
            if(q1.isEmpty()){
                st.append(-1);
            }
            else{
             st.append(q1.peek());
            }
          }
    
        }
        System.out.println(st);
    }
}
