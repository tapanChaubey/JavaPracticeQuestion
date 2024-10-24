package PriorityQueue;
import java.util.*;
public class TEST1 {
   public static void main(String[]args){
      PriorityQueue<Integer>pq=new PriorityQueue<>();
      pq.add(5);// add time o(log(n))
      pq.add(2);
      pq.add(3);
      pq.add(1);
      //System.out.println(pq.size());
      while(!pq.isEmpty()){
        System.out.println(pq.peek());// o(1) time complexity
        pq.remove();//o(log(n)) time complexity
      }
      //System.out.println(pq);

// ager hame priorityQueue ke ander reverse karana ho to 
//  // ham comparator function ka use karate hai

// ex PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder())
/// comaparator is inteface 

}

}
