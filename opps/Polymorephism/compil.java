package opps.Polymorephism;
import java.util.*;
public class compil {
   public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    drive d1=new drive();
    d1.set(2.1f,4);
    d1.set(5,"Chips");
   } 
}
class Base{
    int price;
    String product;
    public void set(int price,String name){
        this.price=price;
        this.product=name;
        System.out.println("price: "+ price);
        System.out.println("Product:"+product);
    }


}
class drive extends Base {
      float a;
      int cal;
      public void set(float a,int  cal){
        this.a=a;
        this.cal=cal;
        System.out.println("A :"+a);
        System.out.println("Cal"+cal);
      }     
}
// from in this type senrio  compiler diceded  that in compile time which fun/method are exicuted
// so it is called methode overloding/compiletime polymorphism 