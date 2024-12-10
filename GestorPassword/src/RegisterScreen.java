import java.util.Scanner;

public class RegisterScreen {
    public static void register(Scanner scanner) {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        
        System.out.println("Registration successful!");
    }
}
