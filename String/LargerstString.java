import java.util.*;
public class LargerstString {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String fuirts[]=new String[n];
    for(int i=0; i<fuirts.length; i++){
        fuirts[i]=sc.next();
    }
    String Largest=fuirts[0];
    for(int i=0; i<fuirts.length; i++){
        if(Largest.compareTo(fuirts[i])<0){
            Largest=fuirts[i];
        }
    }
    System.out.println(Largest);
    // StringName.CompareTo(StringName) function Do string ko compare karata 
    // jo lexicographical order ka hota hai exampal apple,mango banana me 
    // mango bada hai kiu ki m,a,b se bada hai to ye string me mango print karega
    //   


}
    
}
