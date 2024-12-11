import javax.swing.*;

public class PasswordManagerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Password Manager");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            LoginScreen loginScreen = new LoginScreen();
            frame.add(loginScreen);
            frame.setVisible(true);
        });
    }
}
