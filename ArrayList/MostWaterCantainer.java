package ArrayList;
import java.util.*;
public class MostWaterCantainer {
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();
        int n=st.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=st.nextInt();
        }
        for(int i=0; i<n; i++){
            List.add(arr[i]);
        }
        int maxWater=0;
        for(int i=0; i<List.size(); i++){
            for(int j=i+1; j<List.size(); j++){
                int ht=Math.min(List.get(i),List.get(j));
                int wid=j-i;
                int currWater=ht*wid;
                maxWater=Math.max(maxWater, currWater);
            }
        }
System.out.println(maxWater);

    }
    
}
