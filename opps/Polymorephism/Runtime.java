package opps.Polymorephism;
import java.util.*;
public class Runtime {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Drive d1=new Drive();
        d1.cal(2,5);



    }
}
class Base{
    int a;
    int b;
    public void cal(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("sum1: "+ a+b);

    }

}
class Drive extends Base{
    public void cal(int a,int b){
        System.out.println(a+b);
    }

}
