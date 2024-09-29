package BackTracking;
import java.util.*;
public class FindAllSubsetString {
    static void FindAll(String str,ArrayList<String>arr,int i,String ans){
        if(i==str.length()){
            arr.add(ans);
            return;
        }
        FindAll(str, arr, i+1, ans+str.charAt(i));
        FindAll(str, arr, i+1, ans);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String>arr=new ArrayList<>();
        FindAll(str,arr,0,"");
        System.out.println(arr);
    }
}
