package ArrayList;
import java.util.*;
public class BeutifullArray {
    public static ArrayList<Integer> checkBeautifullarray(int n){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        for(int i=2; i<=n; i++){
            ArrayList<Integer>temp=new ArrayList<>();
           
            // for even
            for(Integer e:List){
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            // // for ODD
            for(Integer e:List){
                // for even
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
            List=temp;
        }
        return List;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(checkBeautifullarray(n));
         
    }
    
}
