package HashMap;
import java.util.*;
public class sethash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt(); 
       // HashSet is unordered set it store data in any order and it does not store 
       // dubblicate element only store unique element

        HashSet<Integer>set=new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(46);
        set.add(44);
        set.add(42);
        set.add(41);
        // using iterator 
        // Iterator it=set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // using enahanced for loop
        for(Integer k:set){
            System.out.println(k);
        }

    }
    
}
