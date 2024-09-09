import java.util.*;
public class Digonal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0; i<n; i++){
            int row=i;
            int col=0;
            while(row>=0 && col<n){
             list.add(arr[row][col]);
             col++;
             row--;
            }
        }
        for(int i=1; i<n; i++){
            int row=n-1;
            int col=i;
            while(row>=0 && col<n){
                list.add(arr[row][col]);
                col++;
                row--;
            }
        }
        System.out.print(list);
    }

}
