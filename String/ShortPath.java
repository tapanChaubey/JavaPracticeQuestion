import java.util.*;
public class ShortPath {
    static int Find(String str){
        int x=0,y=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                y--;
            }
        }
        float x2=x*x;
        float y2=y*y;
        return (int)Math.sqrt(x2+y2);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Find(str));
    }
    
}
