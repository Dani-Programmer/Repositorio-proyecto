import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class PasswordGeneratorScreen extends JPanel {
    private JTextField lengthField;
    private JButton generateButton;
    private JButton backButton;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public PasswordGeneratorScreen(CardLayout cardLayout, JPanel cardPanel) {
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); 

        JLabel lengthLabel = new JLabel("Password Length:");
        lengthField = new JTextField(20); 
        generateButton = new JButton("Generate Password");
        backButton = new JButton("Back to Main Screen");

        // Ajustar tamaño de los botones
        Dimension buttonSize = new Dimension(150, 40); 
        generateButton.setPreferredSize(buttonSize);
        backButton.setPreferredSize(buttonSize);

        // Ajustar tamaño de la fuente
        Font font = new Font("Arial", Font.PLAIN, 18); 
        lengthLabel.setFont(font);
        lengthField.setFont(font);
        generateButton.setFont(font);
        backButton.setFont(font);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lengthLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(lengthField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(generateButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(backButton, gbc);

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
                cardLayout.show(cardPanel, "MainScreen");
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
