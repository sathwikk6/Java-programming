import java.util.Scanner;
public class simpleintrest
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Are you a senior citizen? (yes/no): ");
        String seniorCitizenStatus = scanner.next();
        double rateOfInterest;
        if (seniorCitizenStatus.equalsIgnoreCase("yes")) 
        {
            rateOfInterest = 0.12;
        } 
        else 
        {
            rateOfInterest = 0.10;
        }
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, years);
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
    public static double calculateSimpleInterest(double principal, double rateOfInterest, int years) 
    {
        return (principal * rateOfInterest * years);
    }
}