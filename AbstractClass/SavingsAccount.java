public class SavingsAccount extends BankAccount{
     private double balance;

     @Override
     public void deposit(double amount) {
        this.balance += amount;
     }

     @Override
     public void withdraw(double amount){
        this.balance -= amount;
     }
    
    public double getBalance(){
        return this.balance;
    }
         
}