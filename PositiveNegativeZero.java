import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
            if (number > 0) {
                System.out.println("Result: The number is positive.");
            } else if (number < 0) {
                System.out.println("Result: The number is negative.");
            } else {
                System.out.println("Result: The number is zero.");
            }
        
    }
}