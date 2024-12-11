import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterScreen extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegisterScreen() {
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("New Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("New Password:");
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Aquí deberías guardar las credenciales
                JOptionPane.showMessageDialog(null, "Registration successful!");
            }
        });
    }
}
