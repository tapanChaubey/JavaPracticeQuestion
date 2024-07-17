package opps;
public class basicopp2 {
    public static void main(String args[]){
        BankAcount B1=new BankAcount();
        B1.set("Tapan Kumar",900000);
        B1.display();


    }
    
}
class BankAcount{
    private int money;
    private String name;
    public void set(String name,int money){
        this.name=name;
        this.money=money;
    }
    void display(){
        System.out.println(name);
        System.out.println(money);
    }

}
