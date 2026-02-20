package EasyLevel;
import java.util.*;
public class OctalToBinary {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decimal=0;
        int base=1;
        while(n>0){
            int rem=n%10;
            decimal=decimal+rem*base;
            base=base*8;
            n=n/10;
        }
        System.out.println(decimal);
        int binary=0;
        base=1;
        while(decimal>0){
            int rem=decimal%2;
            binary=binary+rem*base;
            base=base*10;
            decimal=decimal/2;
        }
        System.out.println(binary);

    }
    
}
