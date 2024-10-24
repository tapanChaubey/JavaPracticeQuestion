package GreedyAlgorithm;
import java.util.*;
public class KnapShack {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val[]=new int[n];
        int weigth[]=new int[n];
        for(int i=0; i<n; i++){
            val[i]=sc.nextInt();
        }
        for(int i=0; i<weigth.length; i++){
            weigth[i]=sc.nextInt();
        }
        int capacity=50;
        double ratio[][]=new double[n][2];
        for(int i=0; i<n; i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weigth[i];
        }
       Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
       double max=0;
         for(int i=ratio.length-1; i>=0; i--){
           int idx=(int)ratio[i][0];
           if(capacity>=weigth[idx]){
            max+=val[idx];
            capacity-=weigth[idx];
           }
           else{
              max+=(capacity*ratio[i][1]);
              capacity=0;
              break;
           }

         }
         System.out.println(max);
    }
}
