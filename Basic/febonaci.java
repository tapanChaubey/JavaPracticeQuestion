package Basic;
import java.util.*;
public class febonaci {
    public static int feb(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return feb(n-1)+feb(n-2);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // first way

        // int a=-1;
        // int b=1;
        // int c=0;
        // for(int i=0; i<n; i++){
        //     c=a+b;
        //     System.out.println(c);
        //     a=b;
        //     b=c;
        // }
        // secand way
        
        int a=feb(n);
        System.out.println(a);
    }
    
}
