package javaInterfacesExcercise;

public class SavingsAccount implements Account {
    private double balance;
    private double interestRate; // e.g., 0.05 for 5%

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings: Withdrew $" + amount);
        } else {
            System.out.println("Savings: Insufficient funds.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings: Calculated Interest is $" + interest);
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Balance: $" + balance);
    }

    // Unique method: Actually adds the interest to the balance
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings: Interest applied. New Balance: " + balance);
    }
}