package Basic;
import java.util.*;
class Abc{
    // methode overloading atumaticaly change the char data into integer asky value
    //printing 
    void area(char a, char b){
        System.out.println(a);
        System.out.println(b);
    }
    void area(float a,float b,float c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       
    }
   
    }
public class arrprint {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        // }
        //  int a;
        // System.out.println(a);
        Abc ob=new Abc();
        //ob.area(4, 3);
        // ob.area('c', 'd');
         ob.area(2,7, 6);
        //ob.put();
    }

    
}
