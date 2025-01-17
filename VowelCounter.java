import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Variables to hold the count of vowels and ASCII values
        int vowelCount = 0;
        StringBuilder asciiValues = new StringBuilder();

        // Loop through the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel (case insensitive)
            if (isVowel(c)) {
                vowelCount++;
                asciiValues.append((int) c).append(" "); // Convert to ASCII
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("ASCII values of vowels: " + asciiValues.toString().trim());
        
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

