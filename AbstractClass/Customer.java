public class Customer {
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;
    
    // Constructor for the customer object.
    public Customer() {
        this.savingsAccount = new SavingsAccount();
        this.checkingAccount = new CheckingAccount();
    }

    

    public void depositToSavingsAccount(double amount){
       this.savingsAccount.deposit(amount);
    }

    public void withdrawFromSavingsAccount(double amount){
        this.savingsAccount.withdraw(amount);
    }

    public void depositToCheckingAccount(double amount){
        this.checkingAccount.deposit(amount);
    }
    
    public void withdrawFromCheckingAccount(double amount) {
        this.checkingAccount.withdraw(amount);
    }

    public void displayAccountBalances(){
        System.out.println("Savings Account Balance: " + this.savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + this.checkingAccount.getBalance());
    }

}
