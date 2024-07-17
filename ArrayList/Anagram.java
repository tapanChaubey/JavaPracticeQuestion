package ArrayList;
import java.util.*;
public class Anagram {
    public static boolean CheckAnagram(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)==true){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }

        }
        return map.isEmpty();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="race";
        String t="care";
       System.out.println(CheckAnagram(s,t));
        
    }
    
}
