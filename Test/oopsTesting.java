package Test;
import java.util.*;
public class oopsTesting {
    static class car{
        static int number=9;
        public car(){
            this.number=10;
        }
     public void sum(int a,int b){
          System.out.println(a+b);
     }
     public void sum(int a,int b,int c){
        System.out.println(a*b*c);
      }
    }
    static class driver extends car{
        public driver(){
            super.sum(3, 3);
        }
        
    }
    public static void main(String args[]){
    car c1=new car();
     c1.sum(1, 3);
     c1.sum(2, 2, 3);
     driver d1=new driver();
    }
}
