package PriorityQueue;
import java.util.*;
public class insertObject {
  static class Student implements Comparable<Student>{// Comparable is thier interfaces
  String name;
  int rank;
  Student(String name,int rank){
    this.name=name;
    this.rank=rank;
  }
 @Override 
 public int compareTo(Student s1){
  return this.rank-s1.rank;
 }
  } 
    public static void main(String[]args){
       PriorityQueue<Student>pq=new PriorityQueue<>();
       pq.add(new Student("Aman",123));
       pq.add(new Student("Tapan", 125));
      pq.add(new Student("vishal",345345)); 
      pq.add(new Student("vijay",3456)); 
      while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"-"+pq.peek().rank);
        pq.remove();
      }
      
    }
}
