package Basic;
import java.util.*;
public class removeDublicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }        
        int j=0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        
        arr[j++]=arr[n-1];
        System.out.println(j);
        for(int i=0; i<j; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
