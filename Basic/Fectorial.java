package Basic;
import java.util.*;
public class Fectorial {
    public static int output(int n){
        // * first way
        // int fac=1;
        // for(int i=n; i>0; i--){
        //     fac=fac*i;
        // }
        // return fac;

        // secand way
        if(n==0){
            return 1;
        }
        else{
           return output(n-1)*n;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int result= output(n);
     System.out.println(result);
    
    }
    
}
