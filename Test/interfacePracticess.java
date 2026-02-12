package Test;
import java.util.*;
interface Vehicle {
  static  int MAX_SPEED = 120; 
    void start();  
}
interface vehicle2{
    abstract void run();
}
class Car implements Vehicle,vehicle2 {
    public void start() {
        System.out.println("Car is starting...");
        System.out.println("Maximum speed allowed: " + MAX_SPEED);
    }
    public void run(){
        System.out.println("The car is fast");
    }
}

public class interfacePracticess {
    public static void main(String args[]){
          Vehicle first=new Car();
           first.start();
           vehicle2 sec=new Car();
           sec.run();
    }
}
