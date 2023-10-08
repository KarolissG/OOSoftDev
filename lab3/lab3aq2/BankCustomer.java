import java.util.Scanner;

public class BankCustomer {
    private String AccName;
    private String AccAddress;
    private int accAmount;
    private double totalBalance;
    private SavingsAccount[] accounts;

    public BankCustomer() {
        Scanner objName = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = objName.nextLine();
        AccName = name;
        Scanner objAddress = new Scanner(System.in);
        System.out.print("Enter your address : ");
        String address = objAddress.nextLine();
        AccAddress = address;
        accounts = new SavingsAccount[3];
        accAmount = 0;
    }

    public void addAccount(SavingsAccount Account) {
        if (accAmount < 3) {
            accounts[accAmount] = Account;
            accAmount++;
            System.out.println("Account number " + (accAmount) + " created");
        } else {
            System.out.println("Already 3 existing accounts");
        }
    }

    public double balance() {
        totalBalance = 0;
        for (int i = 0; i < accAmount; i++) {
            totalBalance = totalBalance + accounts[i].getBalance();
        }
        return totalBalance;
    }

    public void summary() {
        System.out.println("Name: " + AccName + "\nAddress: " + AccAddress);
        for (int i = 0; i < accAmount; i++) {
            System.out.println("Account " + (i + 1) + " balance : " + accounts[i].getBalance());
        }

    }
}
