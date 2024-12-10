import java.util.Scanner;

public class PasswordManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {
            if (!loggedIn) {
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        loggedIn = LoginScreen.login(scanner);
                        break;
                    case 2:
                        RegisterScreen.register(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                MainScreen.showMainScreen(scanner);
            }
        }
    }
}
