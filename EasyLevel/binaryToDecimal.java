package EasyLevel;
import java.util.*;
public class binaryToDecimal {
    public static void main(String []arag){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decimal=0;
        int base=1;
     while(n>0){
          int rem=n%10;
          decimal=decimal+rem*base;
          base=base*2;
          n=n/10;
         
     }
     System.out.println(decimal);
        
    }
    
}
