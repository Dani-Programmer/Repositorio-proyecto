import java.util.Scanner;

public class AccountManagementScreen {
    public static void manageAccounts(Scanner scanner) {
        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Back to Main Screen");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addAccount(scanner);
                    break;
                case 2:
                    viewAccounts();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addAccount(Scanner scanner) {
        System.out.print("Enter the service name: ");
        String service = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        
        System.out.println("Account added successfully.");
    }

    private static void viewAccounts() {
        
        System.out.println("Viewing accounts...");
    }
}
