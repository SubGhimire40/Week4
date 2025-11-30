import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");

            int var = scan.nextInt();

            if ((var % 3 == 0) && (var % 5 == 0)) {
                System.out.println("Result: The number is divisible by both 3 and 5.");
            } else {
                System.out.println("Result: The number is NOT divisible by both 3 and 5.");
            }

    }
}