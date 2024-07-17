package HashMap;
import java.util.*;
public class InslizedHashMap {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    HashMap<String,Integer>hm=new HashMap<>();
    // put Opration basicaly strore the element in hashMap from (key,value) pair.
    hm.put("india",150);
    hm.put("chaina",140);
    hm.put("nepal", 7);
    hm.put("us",9);
    hm.put("russia",8);
    //System.out.println(hm);
    // 1. get Opration 
    // es opration me hm.get(key)=value(es opration se hame value return hoga);
    //example
    System.out.println(hm.get("india"));
    // 2.containsKey() Opration
    // in this opration we find the element in hashMap.if element is present then 
    //  return true and element not present the return false
    // basicaly this function is using for checking element in HashMap
    // example
    System.out.println(hm.containsKey("india"));// return true becouse element is present
    System.out.println(hm.containsKey("tapan"));// return false becouse element is not present
// 3. remove Opration -> in this Opration remove the element in hashMap
// in this case we passing key then delete the pair in hashMap.as well as 
// return the value of remove element.
// example
System.out.println(hm.remove("india"));// return value becouse this pair is present
System.out.println(hm.remove("tapan"));// return null becouse this pair is not present
// spaical not
// if which pair is not present in hashMap then return null value


    
    }

}
