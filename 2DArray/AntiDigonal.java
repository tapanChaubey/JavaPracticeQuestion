import java.util.*;
public class AntiDigonal {
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
        int row=0; 
        int col=i;
        while(row<n && col>=0){
         list.add(arr[row][col]);
         row++;
         col--;
        }
    }
    for(int i=1; i<n; i++){
        int row=i;
        int col=n-1;
        while(row<n && col>=0){
            list.add(arr[row][col]);
             row++;
            col--;
        }
    }
 System.out.println(list);
  }  
}
