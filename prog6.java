import java.util.Scanner;

public class prog6 {
    
    static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }
    
    static class DepartmentMismatchException extends Exception {
        public DepartmentMismatchException(String message) {
            super(message);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String correctUsername = "john_doe";
        String correctPassword = "password123";
        String correctDepartment = "IT";
        
       
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        System.out.print("Enter department: ");
        String department = sc.nextLine();
        
        try {
            
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new InvalidCredentialsException("Invalid username or password.");
            }
            
            
            if (!department.equals(correctDepartment)) {
                throw new DepartmentMismatchException("You do not belong to the correct department.");
            }
            
            
            System.out.println("Welcome to the organization, " + username + "!");
            
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DepartmentMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
