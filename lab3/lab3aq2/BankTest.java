public class BankTest {
    public static void main(String args[]) {
        SavingsAccount account1 = new SavingsAccount(3000.0);
        SavingsAccount account2 = new SavingsAccount(359.0);
        SavingsAccount account3 = new SavingsAccount(5986.0);

        BankCustomer customer1 = new BankCustomer();

        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addAccount(account3);
        customer1.summary();

    }
}
