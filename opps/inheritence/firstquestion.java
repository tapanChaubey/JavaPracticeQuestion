package opps.inheritence;
import java.util.*;
public class firstquestion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Drive ob=new Drive(n);
       ob.print();
        
    }
    
}
class Base{
    int data;
    int data1;
    Base(int d,int d1){
        data=d;
        data1=d1;
    }
    int  sum(){
        return data1+data;
    }
    int sub(){
        return data-data1;
    }
    int mul(){
        return data*data1;
    }
}
class Drive extends Base{
   private int data3;
    Drive(int d){
        super(4,3);
        data3=d;
    }
    void print(){
        System.out.println(data1+data+data3);
    }

}
