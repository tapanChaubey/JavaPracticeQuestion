package GreedyAlgorithm;
import java.util.*;
public class ActivitySlection1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxCount=0;
        int lastEndelment=0;
        // store first item
        lastEndelment=end[0];
        arr.add(0);
        maxCount=1;
        for(int i=1; i<start.length; i++){
            if(start[i]>=lastEndelment){
                maxCount++;
                lastEndelment=end[i];
                arr.add(i);
            }
        }
        System.out.println(arr);
        System.out.println(maxCount);
    }
}
