package HashMap;
import java.util.*;
public class FindIntineraryTicket {
    public static String getStart(HashMap<String,String>hm){
        HashMap<String,String>revHM=new HashMap<>();
        for(String k:hm.keySet()){
            revHM.put(hm.get(k),k);
        }
        for(String k: hm.keySet()){
            if(!revHM.containsKey(k)){
                return k;
            }
        }
        return null;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        HashMap<String,String>hm=new HashMap<>();
        hm.put("bettiah","Delhi");
        hm.put("Delhi","bengaluru");
        hm.put("bengaluru","goa");
        hm.put("goa","kolkata");
        hm.put("mumbai","bettiah");
        String start=getStart(hm);
        for(String k:hm.keySet()){
            System.out.print(" key:= "+start+", value= "+hm.get(start)+"->");
            start=hm.get(start);
        }
    }
    
}
