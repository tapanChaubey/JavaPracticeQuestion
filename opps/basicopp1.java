package opps;
import java.util.*;

public class basicopp1 {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("blue");
        p1.setPrice(25);
        p1.display();

    }
    
}
class Pen{
    String color;
    int price;
    void setColor(String newColor){
        color=newColor;
    }
    void setPrice(int v){
        price=v;
    }
    void display(){
        System.out.println(color);
        System.out.println(price);

    }
}
