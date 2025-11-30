import java.util.Scanner;

public class oddEven
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number to check odd or even");
        int num = scan.nextInt();
        
        if(num==0)
        {
            System.out.println("The number is zero, which is neither odd nor even");
        }
        else if(num % 2 == 0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}