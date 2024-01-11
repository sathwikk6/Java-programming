import java.util.Arrays;
import java.util.Scanner;
public class ReverseAlphabeticalOrder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        for (int i = 0; i < characters.length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;
        }
        String result = new String(characters);
        System.out.println("Word in Reverse Alphabetical Order: " + result);
    }
}
