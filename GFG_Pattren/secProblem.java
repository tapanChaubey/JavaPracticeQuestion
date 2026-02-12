package GFG_Pattren;
import java.util.*;
public class secProblem {
    public static void main(String[]arags){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
    }
    
}
