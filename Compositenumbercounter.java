import java.util.Scanner;
public class Compositenumbercounter 
{
    public static void main(String[] args) 
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = Scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = Scanner.nextInt();
        }
        int compositeCount = 0;
        for (int i = 0; i < n; i++) 
        {
            boolean isComposite = false;
            for (int j = 2; j <= array[i] / 2; j++) 
            {
                if (array[i] % j == 0) 
                {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) 
            {
                compositeCount++;
            }
        }
        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
}

