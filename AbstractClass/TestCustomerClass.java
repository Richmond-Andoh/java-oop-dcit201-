public class TestCustomerClass {
    public static void main(String[] args) {
        Customer customer = new Customer();
        
        customer.depositToSavingsAccount(500.92);
        customer.withdrawFromSavingsAccount(238.34);
        customer.displayAccountBalances();

        customer.depositToCheckingAccount(293.23);
        customer.withdrawFromCheckingAccount(100.43);
        customer.displayAccountBalances();
    }
}
