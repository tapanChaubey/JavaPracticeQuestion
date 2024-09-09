package opps.Interfaces;
import java.util.*;
public class implementInterface2 {
    public static void main(String [] args){
        rectangle rect=new rectangle();
        circle cir=new circle();
        area a;
        a=rect;
        System.out.println(a.calculate(10, 20));
        a=cir;
        System.out.println(a.calculate(10, 0));

    }
    
}
interface area{
    final static float pi=3.14f;
    float calculate(float x, float y);
}
class rectangle implements area{
    public float calculate(float x,float y){
        return x*y;
    }
}
class circle implements area{
    public float calculate(float x,float y){
        return pi*x*x;
    }
}
