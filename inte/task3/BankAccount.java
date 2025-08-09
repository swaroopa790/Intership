package inte.task3;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        addTransaction(String.format("Account opened with ₹%.2f", balance));
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            addTransaction(String.format("Withdrew ₹%.2f | Remaining Balance: ₹%.2f", amount, balance));
            return true;
        } else {
            addTransaction(String.format("Failed withdrawal ₹%.2f | Insufficient funds | Balance: ₹%.2f", amount, balance));
            return false;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction(String.format("Deposited ₹%.2f | New Balance: ₹%.2f", amount, balance));
            return true;
        } else {
            addTransaction(String.format("Failed deposit ₹%.2f | Invalid amount | Balance: ₹%.2f", amount, balance));
            return false;
        }
    }

    public void addTransaction(String detail) {
        transactionHistory.add(detail);
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
