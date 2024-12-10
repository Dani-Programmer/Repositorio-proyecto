import java.util.Random;
import java.util.Scanner;

public class PasswordGeneratorScreen {
    public static void generatePassword(Scanner scanner) {
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();
        scanner.nextLine(); 

        String password = generateRandomPassword(length);
        System.out.println("Generated password: " + password);
    }

    private static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

  
}
