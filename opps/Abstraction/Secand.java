package opps.Abstraction;
import java.util.*;

public class Secand {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        child c1 = new child();
        
        // Print the initial color (which should be "red")
        //System.out.println("Initial color: " + c1.color);
        
        // Change the color and print it
        c1.change();
        ///System.out.println("Changed color: " + c1.color);
        
        // Call the set method
        c1.set();
    }
}

abstract class base {
    String color;
    
    base() {
        color = "red";
    }
    
    abstract void set();
}

class child extends base {
    void change() {
        color = "yellow";
    }
    
    public void set() {
        System.out.println("child class");
    }
}
