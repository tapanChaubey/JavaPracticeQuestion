import java.util.*;
public class FindFirstOccarance {
    static int firstOccrance1(int arr[],int i,int k){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==k){
            return i;
        }
        else{
            return firstOccrance1(arr, i+1, k);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(firstOccrance1(arr,0,k));
    }
}
