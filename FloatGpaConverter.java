import java.util.Scanner;

public class FloatGpaConverter {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float gpa; 
        String grade;
        
        do{
        System.out.println("Enter the GPA (0.0 to 4.0):");
        
            gpa = scan.nextFloat();

            if (gpa < 0.0f || gpa > 4.0f) {
                System.out.println("❌ Error: Invalid GPA value. GPA must be between 0.0 and 4.0.");
                return;
            }
        }while(gpa < 0.0f || gpa > 4.0f);
            
            if (gpa >= 3.6f) {
                grade = "A+"; 
            } else if (gpa >= 3.2f) {
                grade = "A"; 
            } else if (gpa >= 2.8f) {
                grade = "B+"; 
            } else if (gpa >= 2.4f) {
                grade = "B"; // 
            } else if (gpa >= 2.0f) {
                grade = "C+"; 
            } else if (gpa >= 1.6f) {
                grade = "D"; 
            } else {
                grade = "FAIL"; 
            }

            System.out.printf("\n🥳 Your GPA of %.2f converts to the grade: **%s**\n", gpa, grade); 



    }
}