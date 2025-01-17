//package javaproperties;

import java.util.Scanner;

public class exceptionClass extends Exception {
    // Custom exception constructor
    public exceptionClass(String message) {
        super(message);
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        String username = "tony";
        String password = "M1racle@123";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username:");
        String s1 = scan.nextLine();
        System.out.println("Enter password:");
        String s2 = scan.nextLine();

        try {
            // String comparison should use .equals()
            if (s1.equals(username) && s2.equals(password)) {
                System.out.println("You are registered successfully.");
            } else if (s1.equals(username) && !s2.equals(password)) {
                throw new exceptionClass("Password is incorrect.");
            } else {
                System.out.println("Username not recognized.");
            }
        } catch (exceptionClass e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            scan.close(); // Close the scanner
        }
    }
}
