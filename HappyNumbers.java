import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    

    // Function to check if a number is happy
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }
        return n == 1;
    }

    // Helper function to calculate the sum of squares of digits
    private static int sumOfSquaresOfDigits(int x) {
        int sum = 0;
        while (x > 0) {
            int digit = x % 10;
            sum += digit * digit;
            x /= 10;
        }
        return sum;
    }

    // Function to find the first ten happy numbers
    public static int[] firstTenHappyNumbers() {
        int[] happyNumbers = new int[10];
        int count = 0;
        int num = 1;
        while (count < 10) {
            if (isHappy(num)) {
                happyNumbers[count] = num;
                count++;
            }
            num++;
        }
        return happyNumbers;
    }

    public static void main(String[] args) {
        int sum=0;
        int[] happyNumbers = firstTenHappyNumbers();
        for(int i=0;i<happyNumbers.length;i++)
        {
            sum=sum+happyNumbers[i];
        }
        System.out.println(sum);
    }
}
