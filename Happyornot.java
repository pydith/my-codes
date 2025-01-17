import java.util.*;
class Happyornot {
    public static void main(String args[]) {
        int n = 100;
        for (int i = 10; i < n; i++) {
            int num = i; // Store the original number
            int sum = 0;
            HashSet<Integer> seen = new HashSet<>(); // To track seen numbers

            while (num != 1 && !seen.contains(num)) {
                seen.add(num);
                sum = 0; // Reset sum for each iteration
                while (num > 0) {
                    int digit = num % 10; // Get last digit
                    sum += (digit * digit); // Add square of digit
                    num /= 10; // Remove last digit
                }
                num = sum; // Update num to the new sum
            }

            if (num == 1) {
                System.out.println("Happy number: " + i);
            }
        }
    }
}
