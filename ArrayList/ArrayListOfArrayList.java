package ArrayList;
import java.util.*;
public class ArrayListOfArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>>MinList=new ArrayList<>();
        ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Integer>List2=new ArrayList<>();
        ArrayList<Integer>List3=new ArrayList<>();
        ArrayList<Integer>List4=new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List2.add(5);
        List2.add(6);
        List2.add(7);
        List2.add(8);
        List3.add(9);
        List3.add(10);
        List3.add(11);
        List3.add(12);
        List4.add(16);
        List4.add(15);
        List4.add(14);
        List4.add(13);
        MinList.add(List1);
        MinList.add(List2);
        MinList.add(List3);
        MinList.add(List4);
        //System.out.println(MinList);
        for(int i=0; i<MinList.size(); i++){
            ArrayList<Integer>curr=MinList.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


    }
    
}
