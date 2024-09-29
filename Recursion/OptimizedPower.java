import java.util.*;
public class OptimizedPower {
    static int PowerFun(int n,int base){
        if(base==0){
            return 1;
        }
        else if(base%2!=0){
            return n*PowerFun(n, base/2)*PowerFun(n, base/2);
        }
        else{
            return PowerFun(n, base/2)*PowerFun(n, base/2);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
      System.out.println(PowerFun(n,base));
    }
}
