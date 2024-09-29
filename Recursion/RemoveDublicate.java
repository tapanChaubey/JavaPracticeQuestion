package Recursion;
import java.util.*;
public class RemoveDublicate {
    static void find(String str,int idx,boolean map[],StringBuilder s){
        if(idx==str.length()){
            System.out.println(s);
            return;
        }
        char currIdx=str.charAt(idx);
         if(map[currIdx-'a']==true){
            find(str, idx+1, map, s);
        }
        else{
          map[currIdx-'a']=true;
          s.append(currIdx);
          find(str, idx+1, map, s);
        }
    }
    public static void main( String []arag){
        Scanner sc=new Scanner(System.in);
        String str="Tapankumarchaubey";
        StringBuilder s=new StringBuilder("");
        find(str.toLowerCase(),0,new boolean[26],s);
    }
}
