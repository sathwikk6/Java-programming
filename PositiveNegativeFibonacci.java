public class PositiveNegativeFibonacci 
{
    public static void main(String[] args) 
    {
        int n = 10; 
        System.out.println("Positive Fibonacci Series:");
        printFibonacci(n, false);
        System.out.println("\nNegative Fibonacci Series:");
        printFibonacci(n, true);
    }

    public static void printFibonacci(int n, boolean negative) 
    {
        int a = 0, b = 1, c;
        int sign = negative ? -1 : 1;
        for (int i = 0; i < n; i++) {
            System.out.print(sign * a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}