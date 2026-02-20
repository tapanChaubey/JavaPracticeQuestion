package EasyLevel;
import java.util.*;
public class binaryToOctal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int octal=0;
        int base=1;
        int decimal=0;
        /// firstly we will convert binary to decimal;
        while(n>0){
            int rem=n%10;
            decimal=decimal+rem*base;
            base=base*2;
            n=n/10;
        }
        int place=1;
        while(decimal>0){
            int rem=decimal%8;
            octal=octal+rem*place;
            place=place*10;
            decimal=decimal/8;
        }
        System.out.println(octal);
    }
    
}
