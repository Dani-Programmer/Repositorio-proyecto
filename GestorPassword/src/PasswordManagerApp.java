import java.awt.*;
import javax.swing.*;

public class PasswordManagerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Password Manager");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400); 
            frame.setLocationRelativeTo(null);

            CardLayout cardLayout = new CardLayout();
            JPanel cardPanel = new JPanel(cardLayout);

            LoginScreen loginScreen = new LoginScreen(cardLayout, cardPanel);
            RegisterScreen registerScreen = new RegisterScreen(cardLayout, cardPanel);
            MainScreen mainScreen = new MainScreen(cardLayout, cardPanel);
            PasswordGeneratorScreen passwordGeneratorScreen = new PasswordGeneratorScreen(cardLayout, cardPanel);

            cardPanel.add(loginScreen, "LoginScreen");
            cardPanel.add(registerScreen, "RegisterScreen");
            cardPanel.add(mainScreen, "MainScreen");
            cardPanel.add(passwordGeneratorScreen, "PasswordGeneratorScreen");

            frame.add(cardPanel);
            frame.setVisible(true);
        });
    }
}
