public class SeparateConsonantsAndVowels 
{
    public static void main(String[] args) 
    {
        // Sample Input
        String givenWord = "Engineering";
        // Function Call
        separateConsonantsAndVowels(givenWord);
    }
    public static void separateConsonantsAndVowels(String word) {
        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (isVowel(ch)) {
                vowels.append(ch);
            } else if (Character.isLetter(ch)) {
                consonants.append(ch);
            }
        }

        System.out.println("Consonants: " + consonants.toString());
        System.out.println("Vowels: " + vowels.toString());
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}