package chap12java2;

import java.util.Scanner;

public class PopulationRecursive {
    public static void main(String[] args) {
        // Init populations (in millions)
        double popCA = 39.0;
        double popTX = 28.0;
        Scanner input = new Scanner(System.in);
        
        // Get rates
        System.out.print("Enter CA growth rate (decimal, e.g., 0.01): ");
        double rateCA = input.nextDouble();
        
        System.out.print("Enter TX growth rate (decimal, e.g., 0.03): ");
        double rateTX = input.nextDouble();
        
        // Enforce rule
        if (rateTX < rateCA) {
            System.out.println("TX rate smaller. Forcing CA rate to 0.");
            rateCA = 0;
        }

        System.out.println("\n--- Projection ---");
        int finalYear = calcGrowth(rateCA, rateTX, popCA, popTX, 0);
        
        System.out.println("\nTexas exceeds California in " + finalYear + " years.");
        input.close();
    }

    // Recursive calculation
    public static int calcGrowth(double rCA, double rTX, double pCA, double pTX, int year) {
        // Display status
        System.out.printf("Year %d: CA = %.2fM | TX = %.2fM%n", year, pCA, pTX);

        // Base case: Texas leads
        if (pTX > pCA) {
            return year;
        }

        // Recursive step: Calc new populations and increment year
        return calcGrowth(rCA, rTX, pCA * (1 + rCA), pTX * (1 + rTX), year + 1);
    }
}