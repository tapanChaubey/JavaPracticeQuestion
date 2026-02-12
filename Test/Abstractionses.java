package Test;
import java.util.*;
public class Abstractionses {
   static abstract class abs{
        int a,b;
        public void sum(int a,int b){
             System.out.println(a+b);
        }
        abstract void sub(int a,int b);

    }
    public static class dfs extends abs{
         public void sub(int a,int b){
            System.out.println(a+b);
         }
    }
    public static void main(String args[]){
         dfs d=new dfs();
         d.sum(4, 5);
         d.sub(7,12);
    }
}
