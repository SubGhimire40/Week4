import java.util.Scanner;

public class PaperSize {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s; 
        
        do {
            System.out.print("Enter paper size (e.g., A4, a3): ");
            s = scan.next().toUpperCase(); 
            
            if (s.length() != 2 || s.charAt(0) != 'A' || s.charAt(1) < '0' || s.charAt(1) > '5') {
                System.out.println("Invalid input. Please enter a valid size (A0, A1, A2, A3, A4, or A5).\n");
            }
        } while (s.length() != 2 || s.charAt(0) != 'A' || s.charAt(1) < '0' || s.charAt(1) > '5');

        System.out.println("\n--- Dimensions for " + s + " ---");

        switch (s) {
            case "A0":
                System.out.println("Millimeters (mm): 841 x 1189 mm");
                System.out.println("Inches: 33.1 x 46.8 inches");
                break;
            case "A1":
                System.out.println("Millimeters:\t 594 x 841 mm");
                System.out.println("Inches:\t 23.4 x 33.1 inches");
                break;
            case "A2":
                System.out.println("Millimeters: 420 x 594 mm");
                System.out.println("Inches:\t 16.5 x 23.4 inches");
                break;
            case "A3":
                System.out.println("Millimeters: 297 x 420 mm");
                System.out.println("Inches:\t 11.7 x 16.5 inches");
                break;
            case "A4":
                System.out.println("Millimeters: 210 x 297 mm");
                System.out.println("Inches:\t 8.3 x 11.7 inches");
                break;
            case "A5":
                System.out.println("Millimeters: 148 x 210 mm");
                System.out.println("Inches:\t 5.8 x 8.3 inches");
                break;
        }
        
    }
}