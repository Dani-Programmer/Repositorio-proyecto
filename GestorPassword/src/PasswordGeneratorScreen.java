import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGeneratorScreen extends JPanel {
    private JTextField lengthField;
    private JButton generateButton;
    private JButton backButton;

    public PasswordGeneratorScreen() {
        setLayout(new GridLayout(3, 2));

        JLabel lengthLabel = new JLabel("Password Length:");
        lengthField = new JTextField();
        generateButton = new JButton("Generate Password");
        backButton = new JButton("Back to Main Screen");

        add(lengthLabel);
        add(lengthField);
        add(generateButton);
        add(new JLabel());
        add(new JLabel());
        add(backButton);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = Integer.parseInt(lengthField.getText());
                String password = generateRandomPassword(length);
                JOptionPane.showMessageDialog(null, "Generated password: " + password);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías volver a la pantalla principal
            }
        });
    }

    private String generateRandomPassword(int length) {
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

