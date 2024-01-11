public class pyramid 
{
    public static void main(String[] args) 
    {
        int n = 4; // Number of rows in the pyramid
        for (int i = 1; i <= n; i++) 
        { // Loop for rows
            for (int j = 1; j <= i; j++) 
            { // Loop for printing asterisks in each row
                System.out.print("*"); // Print asterisk
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}