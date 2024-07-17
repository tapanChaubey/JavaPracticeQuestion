package ArrayList;
import java.util.*;
public class MostWaterContainerOptimize {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            List.add(arr[i]);
        }
        int left=0,right=List.size()-1;
        int maxWater=0;
        while(left<right){
            int ht=Math.min(List.get(left),List.get(right));
            int wid=right-left;
            int currWater=ht*wid;
            maxWater=Math.max(maxWater,currWater);
            if(List.get(left)<=List.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxWater);
    }

    
}
