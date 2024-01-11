import java.util.Scanner;
public class SpecialCharacter 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        int specialCharacterCount = 0;
        System.out.println("Special characters in the line:");
        for (int i = 0; i < inputLine.length(); i++) {
            char ch = inputLine.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println(ch);
                specialCharacterCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharacterCount);
        scanner.close();
    }
}
