package BackTracking;
import java.util.*;
public class findAllPermutations {
    public static void findPer(String str,ArrayList<String>arr,String str1,int n){
         if(str1.length()==n){
            arr.add(str1);
            return;
         }
         for(int i=0; i<str.length(); i++){
             char ch=str.charAt(i);
             String newStr=str.substring(0, i)+str.substring(i+1);
             findPer(newStr, arr, str1+ch, n);
         }
    }
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       ArrayList<String>arr=new ArrayList<>();
         String str1="";
         findPer(str,arr,str1,str.length());
         System.out.println(arr);
   }
}
