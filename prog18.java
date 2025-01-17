class AddAlternateDigits {
    public static void main(String[] args) {
        int number = 9685763;
        int sum = addAlternateDigits(number);
        System.out.println("Sum of alternate digits: " + sum);
    }

    public static int addAlternateDigits(int n) {
        String str = Integer.toString(n);
        int sum = 0;

        
        for (int i = str.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(str.charAt(i));
            
            
            if ((str.length() - 1 - i) % 2 == 0) { 
                sum += digit;
            }
        }

        return sum;
    }
}
