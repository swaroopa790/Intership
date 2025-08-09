package inte.task3;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000.00);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}

