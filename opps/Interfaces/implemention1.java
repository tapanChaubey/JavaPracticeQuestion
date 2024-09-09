package opps.Interfaces;
import java.util.*;
public class implemention1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
    //    King k1=new King();
    //    k1.move();
    //    Slave s1=new Slave();
    //    s1.move();
       Queen q1=new Queen();
       q1.move();

    }  
}
interface chessPlayer{
    void move();
}
class Queen implements chessPlayer{
   public void move(){
    System.out.println("move the quene in all direction !");
    }
}
class King implements chessPlayer{
      public void move(){
          System.out.println("move the king in all directions !");

         }
}
class Slave implements chessPlayer{
    public void move(){
        System.out.println("move of the slave in all directions !");
    }
}
