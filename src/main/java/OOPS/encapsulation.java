package OOPS;
class BankAccount{
    private int bal = 0;

   public void setter(int bal){
       if(bal>=0){
           this.bal += bal;
           System.out.print(bal);
       }
   }

   public void display(){
       System.out.print("your balance is " + bal);
   }
}
public class encapsulation {
    public static void main(String[] args){

        BankAccount ba = new BankAccount();
        ba.setter(100);
        ba.display();

    }
}
