package opps.inheritence;
import java.util.*;

public class multileval {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        drive1 ob = new drive1(3, 4);
        ob.sub();
        sc.close(); // Closing the Scanner object
    }
}

class base1 {
    int data;
    String str;

    base1(int d) {
        data = d;
        //str = "Codequestion";
    }

    void display() {
        System.out.println(data);
       // System.out.println(str);
    }
}

class Drive extends base1 {
    int price;

    Drive(int d) {
        super(6); // Calling the base class constructor with a value
        price = d;
    }

    void print() {
        System.out.println(price + " " + data);
    }
}

class drive1 extends Drive {
    int a, b;

    drive1(int v, int v1) {
        super(9); // Calling the Drive class constructor with a value
        a = v;
        b = v1;
    }

    void sub() {
        System.out.println(a + b);
    }
}
