package ArrayList;
import java.util.*;
public class LonelyNo {
    public static void checkLonely(ArrayList<Integer>List){
        ArrayList<Integer>LonleyList=new ArrayList<>();
        // BootForce Aproch
        // for(int i=0; i<List.size(); i++){
        //     int c1=0;
        //     for(int j=0; j<List.size(); j++){
        //         if(List.get(i)==List.get(j)){
        //             c1++;
        //         }
        //     }
        //     if(c1==1){
        //         int leftelement=List.get(i)-1;
        //         int rightelement=List.get(i)+1;
        //         if(List.contains(leftelement)==false && List.contains(rightelement)==false){
        //             LonleyList.add(List.get(i));
        //         }
        //     }

        // }
        // Optimized Approch using LinkedHashMap DATA Structure
        // Becouse LinkedHashMap is store the key value in sequence form
        // so this approch is very usefull
        // hashmap is unordered map.
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0; i<List.size(); i++){
            if(map.containsKey(List.get(i))){
                map.put(List.get(i),List.get(i)+1);
            }
            else{
                map.put(List.get(i),1);
            }
        }
        Set<Integer>keySet=map.keySet();
        for (Integer k : keySet) {
            if(map.get(k)==1){
                int leftNo=k-1;
                int rightNo=k+1;
                if(map.containsKey(leftNo)==false && map.containsKey(rightNo)==false){
                    LonleyList.add(k);
                }
            } 
        }
        for(int i=0; i<LonleyList.size(); i++){
            System.out.print(LonleyList.get(i)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            List.add(arr[i]);
        }
        checkLonely(List);
    }
    
}
