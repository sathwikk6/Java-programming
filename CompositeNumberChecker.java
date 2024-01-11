import java.util.Scanner;
public class CompositeNumberChecker 
{
 static boolean isComposite(int num) 
 {
    if (num <= 1) 
    {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) 
    {
      if (num % i == 0) 
      {
        return true; 
      }
    }
    return false; 
  }
   public static void main(String[] args) 
   {
    Scanner scanner = new Scanner(System.in);
    int number = 12;
    boolean result = isComposite(number);
    if (result) 
    {
      System.out.println(number + " is a composite number.");
    } else {
      System.out.println(number + " is not a composite number.");
    }
    scanner.close();
  }
}