package javaInterfacesExcercise;

public class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current: Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        // Allow withdrawal if balance + overdraft limit covers it
        if ((balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Current: Withdrew $" + amount);
        } else {
            System.out.println("Current: Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current: No interest on Current Accounts.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Unique method: Checks if user is borrowing money
    public void checkOverdraftStatus() {
        if (balance < 0) {
            System.out.println("Current: You are in overdraft by $" + Math.abs(balance));
        } else {
            System.out.println("Current: You are not using your overdraft.");
        }
    }
}