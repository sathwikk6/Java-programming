import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (MM/dd/yyyy): ");
        String dateString = scanner.nextLine();
        scanner.close();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = dateFormat.parse(dateString);
            int year = getYear(date);

            if (isLeapYear(year)) 
            {
                System.out.println("Given year is a Leap Year.");
            } 
            else 
            {
                System.out.println("Given year is a Non Leap Year.");
            }
        } 
        catch (ParseException e) 
        {
            System.out.println("Invalid date format. Please enter the date in MM/dd/yyyy format.");
        }
    }

    public static int getYear(Date date) 
    {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(yearFormat.format(date));
    }
    public static boolean isLeapYear(int year) 
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}