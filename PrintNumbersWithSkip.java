import java.util.Scanner;
public class PrintNumbersWithSkip 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number (M): ");
        int m = scanner.nextInt();
        System.out.print("Enter the ending number (N): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number to skip (K): ");
        int k = scanner.nextInt();
        if (m > n) 
        {
            System.out.println("Starting number (M) should be less than or equal to ending number (N).");
            return;
        }
        System.out.println("Numbers from " + m + " to " + n + " with a skip of " + k + ":");
        for (int i = m; i <= n; i += k+1) 
        {
            System.out.print(i + " ");
        }
        scanner.close();
}
}