package javaInterfacesExcercise;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
   
    public static void main(String[] args) {
        Bank myBank = new Bank();

        // Create accounts
        SavingsAccount mySavings = new SavingsAccount(1000, 0.05); 
        CurrentAccount myCurrent = new CurrentAccount(500, 200);   

        // Add to bank
        myBank.addAccount(mySavings);
        myBank.addAccount(myCurrent);

        // Demo
        System.out.println("--- Individual Operations ---");
        mySavings.deposit(200);
        mySavings.applyInterest();
        
        myCurrent.withdraw(600);
        myCurrent.checkOverdraftStatus();
        
        myBank.runDailyOperations();
    }
}