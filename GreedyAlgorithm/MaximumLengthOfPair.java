package GreedyAlgorithm;
import java.util.*;
public class MaximumLengthOfPair {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pair[][]=new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                pair[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        int lastEndelment=pair[0][1];
        int max=1;
        for(int i=1; i<n; i++){
        if(lastEndelment<pair[i][0]){
            max++;
            lastEndelment=pair[i][1];
        }
        }
        System.out.println(max);
    }
}
