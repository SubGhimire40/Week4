import java.util.Scanner;

public class CinemaTicketMonolith {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("**************************************************");
        System.out.println("| XFX CINEMA TICKET CALCULATION SYSTEM |");
        System.out.println("**************************************************");
        System.out.println("--- PRICING RULES REFERENCE ---");
        System.out.println("| Base Price: (1) Child: 150.0 | (2) Adult: 250.0 | (3) Senior: 200.0 |");
        System.out.println("| Surcharge: (H) Hindi: +50.0 | (E) English: +100.0 | (N) Nepali: +0.0 |");
        System.out.println("| Sequential Discounts: (S) Student: 20% | (F) Festival: 15% |");
        System.out.println("--------------------------------------------------");
        
        
        int ageGroup;
        do {
            System.out.print("Please enter the corresponding numeric code for your Age Group (1, 2, or 3): "); 
            ageGroup = scan.nextInt();
            
            if (ageGroup < 1 || ageGroup > 3) {
                System.out.println("ERROR: Age Group input is invalid. Please enter 1, 2, or 3.");
            }
        } while (ageGroup < 1 || ageGroup > 3);

        char movieLanguage = 'X';
        do {
            System.out.print("Please enter the Language Code (N for Nepali, H for Hindi, E for English): "); 
            movieLanguage = scan.next().toUpperCase().charAt(0);
            
            if (movieLanguage != 'N' && movieLanguage != 'H' && movieLanguage != 'E') {
                System.out.println("ERROR: Invalid language code. Please enter N, H, or E.");
            }
        } while (movieLanguage != 'N' && movieLanguage != 'H' && movieLanguage != 'E');

        char studentInput = 'X';
        do {
            System.out.print("Do you have a valid Student ID for a 20% discount? (Enter Y for Yes or N for No): "); 
            studentInput = scan.next().toUpperCase().charAt(0);
            
            if (studentInput != 'Y' && studentInput != 'N') {
                System.out.println("ERROR: Invalid status input. Please enter Y or N.");
            }
        } while (studentInput != 'Y' && studentInput != 'N');

        char festivalInput = 'X';
        do {
            System.out.print("Is today a Festival Day for a 15% discount (applied after student discount)? (Enter Y for Yes or N for No): "); 
            festivalInput = scan.next().toUpperCase().charAt(0);
            
            if (festivalInput != 'Y' && festivalInput != 'N') {
                System.out.println("ERROR: Invalid status input. Please enter Y or N.");
            }
        } while (festivalInput != 'Y' && festivalInput != 'N');
        
        System.out.println("--------------------------------------------------");

        
        float basePrice = 0.0f, surchargeAmount = 0.0f;
        
        
        switch (ageGroup) {
            case 1: basePrice = 150.0f; break; 
            case 2: basePrice = 250.0f; break; 
            case 3: basePrice = 200.0f; break; 
            default: basePrice = 250.0f; break;
        }

        
        switch (movieLanguage) {
            case 'H': surchargeAmount = 50.0f; break; 
            case 'E': surchargeAmount = 100.0f; break; 
            case 'N': surchargeAmount = 0.0f; break;
            default: surchargeAmount = 0.0f; break;
        }

        float priceBeforeDiscounts = basePrice + surchargeAmount;
        float studentDiscountAmount = 0.0f, festivalDiscountAmount = 0.0f;
        float currentRunningPrice = priceBeforeDiscounts;

        
        if (studentInput == 'Y') {
            studentDiscountAmount = currentRunningPrice * 0.20f;
            currentRunningPrice -= studentDiscountAmount;
        }

        
        if (festivalInput == 'Y') {
            festivalDiscountAmount = currentRunningPrice * 0.15f;
            currentRunningPrice -= festivalDiscountAmount;
        }
        
        float finalPrice = currentRunningPrice;
        
        
        
        
        System.out.println("\n--- FINAL TRANSACTION RECEIPT ---");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Base Ticket Price (By Age Group):\tRs. " + basePrice);
        System.out.println("2. Language Surcharge (Added Cost):\tRs. +" + surchargeAmount);
        System.out.println("3. Price Before Any Discounts:\t\tRs. " + priceBeforeDiscounts);
        System.out.println("--------------------------------------------------");

        
        System.out.println("4. Student Discount Applied (20%):\tRs. -" + studentDiscountAmount);
        
        
        float priceAfterStudent = priceBeforeDiscounts - studentDiscountAmount;
        System.out.println("5. Price After Student Discount:\tRs. " + priceAfterStudent);
        
        
        System.out.println("6. Festival Discount Applied (15%):\tRs. -" + festivalDiscountAmount);
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("7. FINAL AMOUNT DUE (NPR):\t\tNPR " + finalPrice);
        System.out.println("**************************************************");

        scan.close();
    }
}