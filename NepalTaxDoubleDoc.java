import java.util.Scanner;

public class NepalTaxDoubleDoc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nIncome Tax Brackets for Single Taxpayers");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("ANNUAL INCOME (NPR)\t| RATE (%)\t| BASE TAX / EXCESS RATE");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Up to 5,00,000\t\t| 1%\t\t| 1% of Income");
        System.out.println("5,00,001 to 7,00,000\t| 10%\t\t| 5,000 + 10% on excess");
        System.out.println("7,00,001 to 10,00,000\t| 20%\t\t| 15,000 + 20% on excess");
        System.out.println("10,00,001 to 20,00,000\t| 30%\t\t| 35,000 + 30% on excess");
        System.out.println("20,00,001 to 50,00,000\t| 36%\t\t| 3,35,000 + 36% on excess");
        System.out.println("Above 50,00,000\t\t| 39%\t\t| 11,35,000 + 39% on excess");
        System.out.println("------------------------------------------------------------------------\n");

        double inc;
        double tax = 0.0; 
        
        do {
            System.out.print("Enter Annual Income (NPR): ");
            inc = scan.nextDouble();

            if (inc <= 0) {
                System.out.println("Error: Income must be a positive value. Please try again.\n");
            }
        } while (inc <= 0); 

        /*
         * ---------------------------------------------------------------------------------------
         * | Annual Income (NPR)   | Tax Rate (%) | Base Tax used in Calculation |
         * ---------------------------------------------------------------------------------------
         * | Up to 5,00,000        | 1%           | 0.00 (Base Case)             |
         * | 5,00,001 to 7,00,000  | 10%          | 5,000.00                     |
         * | 7,00,001 to 10,00,000 | 20%          | 15,000.00                    |
         * | 10,00,001 to 20,00,000| 30%          | 35,000.00                    |
         * | 20,00,001 to 50,00,000| 36%          | 3,35,000.00                  |
         * | Above 50,00,000       | 39%          | 11,35,000.00                 |
         * ---------------------------------------------------------------------------------------
         */
        
        
        if (inc > 5000000) {
            tax = 1135000.00;
            tax += (inc - 5000000) * 0.39;
        } 
        else if (inc > 2000000) {
            tax = 335000.00;
            tax += (inc - 2000000) * 0.36;
        } 
        else if (inc > 1000000) {
            tax = 35000.00;
            tax += (inc - 1000000) * 0.30;
        } 
        else if (inc > 700000) {
            tax = 15000.00;
            tax += (inc - 700000) * 0.20;
        } 
        else if (inc > 500000) {
            tax = 5000.00;
            tax += (inc - 500000) * 0.10;
        } 
        else { 
            tax = inc * 0.01;
        }
        
        System.out.printf("\nAnnual Income: NPR %.2f", inc);
        System.out.printf("\nTotal Tax Payable: NPR %.2f", tax);

        scan.close();
    }
}