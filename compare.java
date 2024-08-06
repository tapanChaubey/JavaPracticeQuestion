import java.util.*;
public class compare {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        String s1="Tapan";
        String s2="Tapan";
        String s3=new String("Tapan");
        if(s1==s2){
            System.out.println("String are  equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if(s1==s3){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        // s1 and s2 ke case me jab hum s1 create karane ke bad s2 creat karate hai 
        // to s2 s1 ke refrence ko hi use karta hai esliye s1 and s2 equal hote hai
        // but s3 naya string s1,s2 ke refrence use nahi karata hai so equal nahi hai
        // esko comprare karene ke liye 
        // String.equals() imbuilt function ka use karate hai
        

    }
    
}
