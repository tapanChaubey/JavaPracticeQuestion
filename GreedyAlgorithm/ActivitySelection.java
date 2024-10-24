package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start[]=new int[n];
        int end[]=new int[n];
        for(int i=0; i<start.length; i++){
            start[i]=sc.nextInt();
        }
        for(int i=0; i<end.length; i++){
            end[i]=sc.nextInt();
        }
        /// using comparator function 
        // firstly we take 2dMatrix
       int Activity[][]=new int[start.length][3];
       for(int i=0; i<start.length; i++){
          Activity[i][0]=i;
          Activity[i][1]=start[i];
          Activity[i][2]=end[i];
       }
       ArrayList<Integer>arr=new ArrayList<>();
       int lastEndelment=Activity[0][2];
       arr.add(0);
       int max=1;
       Arrays.sort(Activity,Comparator.comparingDouble(o->o[2]));
       arr.add(0);
       int max=1;
       for(int i=1; i<n; i++){
            if(Activity[i][1]>=lastEndelment){
                lastEndelment=Activity[i][2];
                arr.add(i);
                max++;
            }
       }
  System.out.println(max);
  System.out.println(arr);
  for(int i=0; i<n; i++){
    for(int j=0; j<3; j++){
        System.out.print(Activity[i][j]);
    }
    System.out.println();
  }
    }
}
