import java.util.Scanner;

public class ScholarshipChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Scholarship Eligibility Program");

        System.out.print("Enter GPA (0.00-4.00): ");
        float gpa = scan.nextFloat();

        System.out.print("Enter Attendance Percentage (0-100): ");
        float attendance = scan.nextFloat();

        System.out.print("Enter Attitude Score (1-10): ");
        int attitudeScore = scan.nextInt();

        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitudeScore < 5) {
                    System.out.println("The student is ELIGIBLE for the scholarship.");
                } else {
                    System.out.println("Not Eligible: Attitude score is 5 or greater. Score must be less than 5.");
                }
            } else {
                System.out.println("Not Eligible: Attendance must be greater than 80%.");
            }
        } else {
            System.out.println("Not Eligible: GPA is must be 3.2 or higher.");
        }

    }
}