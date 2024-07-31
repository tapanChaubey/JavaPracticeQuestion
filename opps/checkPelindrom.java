package opps;
import java.util.*;
public class checkPelindrom {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Pelindrome pi1=new Pelindrome();
       System.out.println(pi1.check(arr));

    }
    
}
class Pelindrome{
    boolean check(int arr[]){
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]==arr[arr.length-1-i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    


}