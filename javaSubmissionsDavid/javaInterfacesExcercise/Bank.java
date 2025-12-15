package javaInterfacesExcercise;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Bank: Account added successfully.");
    }

    // Iterates through all accounts to show polymorphism in action
    public void runDailyOperations() {
        System.out.println("\n--- Running Daily Bank Ops ---");
        for (Account acc : accounts) {
            acc.viewBalance();
            acc.calculateInterest();
            System.out.println("----------------");
        }
    }
}