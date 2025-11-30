import java.util.Scanner;

public class passFail
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the obtained marks to check your Pass or Fail status");
    int marks = scan.nextInt();
    
    if(marks>100 && marks<0)
    {
        System.out.println("Please Enter a Valid Value for marks and try again in the next Execution");
    }
    else if(marks>=40)
    {
        System.out.println("You have attained passing marks!!");
    }
    else
    {
        System.out.println("You have attainded failing marks!!");
    }
    }
}