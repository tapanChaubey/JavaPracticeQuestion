package HashMap;
import java.util.*;
public class UnionAndIntersecation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int n1=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0; i<n; i++){
            List.add(arr1[i]);
            
        }
        ArrayList<Integer>IList=new ArrayList<>();
       
        ArrayList<Integer>UList=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        
        
        for(int i=0; i<arr.length; i++){
         map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
           
        }
        for(int i=0; i<List.size(); i++){
            if(map.containsKey(List.get(i))){
               IList.add(List.get(i));
               UList.add(List.get(i));
               map.remove(List.get(i));
               List.remove(List.get(i));
            }
            else{
                UList.add(List.get(i));
                map.remove(List.get(i));
                List.remove(List.get(i));

            }
        }
        System.out.println(IList);
        System.out.println(UList);
      

    }
    
}
