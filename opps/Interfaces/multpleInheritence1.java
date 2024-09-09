package opps.Interfaces;
import java.util.*;

public class multpleInheritence1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Drive d1=new Drive(12, 7f);
        d1.getArea();
        d1.getPermeter();
        d1.getRedius();
        d1.getArea1();
        d1.getPermeter1();
        d1.getBreath();


    }
}
interface Base1{
    final static float pi=3.14f;
    void getArea();
    void getRedius();
    void getPermeter();
}


interface Base2{
final static int breath=12;
void getArea1();
void getBreath();
void getPermeter1();
}

// drive class
class Drive implements Base1,Base2{
    int len;
    float radius;
    public Drive(int len,float radius){
        this.len=len;
        this.radius=radius;

    }
    public void getArea(){
        System.out.println(pi*radius*radius);
    }
  public  void getRedius(){
    System.out.println(radius);

  }
   public void getPermeter(){
    System.out.println(2*pi*radius);

   }
  public void getArea1(){
    System.out.println(breath*len);

  }
 public void getBreath(){
  System.out.println(breath);
 }
public void getPermeter1(){
System.out.println(breath+len);
}

}

