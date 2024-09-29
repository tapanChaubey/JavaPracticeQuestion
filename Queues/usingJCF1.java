package Queues;
import java.util.*;
public class usingJCF1 {
   public static void main(String []args){
    Queue<Integer>q1=new LinkedList<>();
      q1.add(12);
      q1.add(13);
      q1.add(14);
      q1.add(16);
      while(!q1.isEmpty()){
        System.out.println(q1.peek());
        q1.remove();
      }

    
   } 
}
