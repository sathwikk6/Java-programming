import java.util.Scanner;
public class Factorscount 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0) 
        {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = countFactors(number);
            System.out.println("The number of factors for " + number + " is " + count);
        }
    }
    public static int countFactors(int n) 
    {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}