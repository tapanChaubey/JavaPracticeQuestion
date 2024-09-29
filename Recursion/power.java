import java.util.*;
public class power {
    static int PowerFun(int n,int base){
        if(base==0){
            return 1;
        }
        else{
            return n*PowerFun(n, base-1);
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
       System.out.println(PowerFun(n,base));
    }
}
