package opps.Abstraction;
import java.util.*;
public class Frist {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        base b1=new base();
        b1.eat();
        b1.walk();
        base2 b2=new base2();
        b2.eat();
        b2.walk();
    }
    
}
abstract class Animal {
     void eat(){
    System.out.println("animals eats");
   }
abstract void walk();
// abstract class me abstract method ko implement nahi kiya jata hai
// and jo class es class ko inherit karata hai usko 
// abstract method ko apne ander insilized karana padata hai
// yahi rule hai abstraction ka 


}
class base extends Animal{
    void walk(){
        System.out.println(" base is walk");
    }
}
class base2 extends Animal{
    void walk(){
        System.out.println("Base2 is walking !");
    }
}


