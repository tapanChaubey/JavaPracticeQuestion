package HashMap;
import java.util.*;
public class HashMaploop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",150);
        hm.put("chaina",140);
        hm.put("nepal", 7);
        hm.put("us",9);
        hm.put("russia",8);
        Set<String>keys=hm.keySet();
        int max=0;
        for (String k : keys) {
            if(max<hm.get(k)){
                max=hm.get(k);
            }
            System.out.println("keys-"+k+",value-"+hm.get(k));
            
        }
        System.out.println(max);


    }
    
}
