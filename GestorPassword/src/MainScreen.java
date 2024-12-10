import java.util.Scanner;

public class MainScreen {
    public static void showMainScreen(Scanner scanner) {
        while (true) {
            System.out.println("1. Manage Accounts");
            System.out.println("2. Generate Password");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    AccountManagementScreen.manageAccounts(scanner);
                    break;
                case 2:
                    PasswordGeneratorScreen.generatePassword(scanner);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
