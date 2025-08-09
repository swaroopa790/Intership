package inte.task3;
import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== ATM Interface =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. View Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    showHistory();
                    break;
                case 0:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }

        } while (choice != 0);
    }

    private void checkBalance() {
        double balance = account.getBalance();
        System.out.printf("💰 Current Balance: ₹%.2f\n", balance);
        account.addTransaction(String.format("Checked balance: ₹%.2f", balance));
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println(" Amount must be greater than 0.");
            account.addTransaction("Failed withdrawal: Invalid amount entered");
        } else if (account.withdraw(amount)) {
            System.out.printf(" Withdrawal of ₹%.2f successful.\n", amount);
            account.addTransaction(String.format("Withdrew ₹%.2f", amount));
        } else {
            System.out.println("Insufficient balance.");
            account.addTransaction(String.format("Failed withdrawal of ₹%.2f due to insufficient balance", amount));
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            account.addTransaction("Failed deposit: Invalid amount entered");
        } else if (account.deposit(amount)) {
            System.out.printf(" Deposit of ₹%.2f successful.\n", amount);
            account.addTransaction(String.format("Deposited ₹%.2f", amount));
        }
    }

    private void showHistory() {
        System.out.println("\n Transaction History:");
        for (String log : account.getTransactionHistory()) {
            System.out.println("• " + log);
        }
    }
}
