public class SavingsAccount {
    private int accountNumber;
    private static int nextAcc = 1;
    private static double annualInterest;
    private double savingsBalance;
    private double monthlyInterest;

    public SavingsAccount(double balance) {
        accountNumber = nextAcc;
        nextAcc++;
        savingsBalance = balance;
    }

    public SavingsAccount() {
        accountNumber = nextAcc;
        nextAcc++;
    }

    public double calculateMonthlyInterest() {
        monthlyInterest = (savingsBalance * annualInterest) / 12;
        monthlyInterest = (monthlyInterest * 100);
        monthlyInterest = monthlyInterest - (monthlyInterest % 1);
        monthlyInterest = monthlyInterest / 100;
        savingsBalance = savingsBalance + monthlyInterest;
        return monthlyInterest;
    }

    public static void modifyInterestRate(double i) {
        annualInterest = i;
    }

    public double getBalance() {
        return savingsBalance;
    }

    public String toString() {
        return ("AccountNo: " + accountNumber + "\nBalance: " + savingsBalance);
    }
}