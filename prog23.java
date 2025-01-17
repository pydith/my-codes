import java.util.*;
class Reverse {
    public static void main(String args[]) {
        int n = 567348;
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];
        
        
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        
        
        StringBuilder reversed = new StringBuilder();
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(digits[i]);
        }
        
        
        int reversedNumberInt = Integer.parseInt(reversed.toString());
        
        
        System.out.println("The reversed number: " + reversedNumberInt);
    }
}
