import java.util.*;
public class StringBuilderstr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("");
        // es type ke type data strucrure me change kar sakte hai
        // esmae insert karane ke liye string.append() ka use karenge
        // esko String me change kare ke leye toString(str) ka use karenge
        // toString() keval aur keval non-primitive dataTYpe ke liye 
        // hota hai example Integer,String,Character etc.
        // spaical bat ye hai ki ye time compleasity ko kam karata hai
        for(char ch='a'; ch<='z'; ch++){
            str.append(ch);
        }
        System.out.println(str);
    }
    
}
