package ArrayList;
import java.util.*;
public class AraayList2question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer>List=new ArrayList<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
         }
         for(int i=0; i<n; i++){
            List.add(arr[i]);
         }
         for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+"->");
         }
         // for delete a element
         for(int i=0; i<List.size(); i++){
            if(i==2){
                List.remove(i);
            }
            else{
                continue;
            }
         }
System.out.println();
System.out.println(List);

         // set element at spacefic index 
         // Opration ---> List.set(index,element);
         List.set(2,14);
         System.out.println(List); 

///  contains Opration in java
// This Oparation are check the element are present or not. if element are present 
// then return true or false
for(int i=0; i<List.size(); i++){
    if(List.contains(14)){
        System.out.println("yes");
        break;
    }
   
} 


         





    }    
}
