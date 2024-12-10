import java.util.Scanner;

public class LoginScreen {
    public static boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

       
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
