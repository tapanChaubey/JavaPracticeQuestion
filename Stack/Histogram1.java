package Stack;
import java.util.*;
public class Histogram1 {
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int l=0,r=0;
        // this approch will bootforse approch
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0; i<n; i++){
         l=i;
         r=i;
         int c1=0;
         int c2=0;
         // travese i se left we check small element to current arr[i] element
         while(l>=0){
            if(arr[i]>arr[l]){
                break;
            }
            c1++;
            l--;
         }
         //// travese i se right we check small element to current arr[i] element
         while(r<n){
            if(arr[i]>arr[r]){
                break;
            }
            c2++;
            r++;
         }
         int max=Math.max(arr[i]*c1,c2*arr[i]);
         a.add(max);

        }
        System.out.println(a);
        int maxi=0;
        for(int i=0; i<a.size(); i++){
            if(maxi<a.get(i)){
                maxi=a.get(i);
            }
        }
        System.out.println(maxi);
    }
    
}
