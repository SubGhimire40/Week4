import java.util.Scanner;

public class DiscountSwitch 
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("A\t\t60%");
        System.out.println("B\t\t40%");
        System.out.println("C\t\t20%");
        System.out.println("D\t\t10%\n");
        
        System.out.println("Enter the Price: ");
        float MP = scan.nextFloat();
        float discount = 0.0f; 
        char opt;
        
        do{
            System.out.println("Enter Category: A/B/C/D");
            opt = Character.toUpperCase(scan.next().charAt(0)); 
            
            if(opt != 'A' && opt != 'B' && opt != 'C' && opt != 'D')
            {
                System.out.println("Error, invalid input!! Try again!!\n");
            }
        }while(opt != 'A' && opt != 'B' && opt != 'C' && opt != 'D');
        
        switch(opt)
        {
            case 'A':
                discount = 0.6f;
                break;
            case 'B':
                discount = 0.4f;
                break;
            case 'C':
                discount = 0.2f;
                break;
            case 'D':
                discount = 0.1f;
                break;
        }
        
        float SP = MP - (MP * discount);
        System.out.printf("Your selling price is Rs. %.2f", SP);
    }
}