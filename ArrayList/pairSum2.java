package ArrayList;
import java.util.*;
public class pairSum2 {
    public static boolean Pair(ArrayList<Integer>List1,int target){
        int bPoint=-1;
        for(int i=0; i<List1.size(); i++){
            if(List1.get(i)>List1.get(i+1)){
                bPoint=i;
                break;
            }
            else{
                continue;
            }
        }
        int left=bPoint+1;
        int right=bPoint;
        int n=List1.size();
        while(left!=right){
            int sum=List1.get(left)+List1.get(right);
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left=(left+1)%n;
            }
            else{
                right=(n+right-1)%n;
            }

        }
        return false;


    }
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
        int target=sc.nextInt();
        System.out.println(Pair(List,target));
    }
    
}
