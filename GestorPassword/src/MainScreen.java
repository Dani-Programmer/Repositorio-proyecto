import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JPanel {
    private JButton manageAccountsButton;
    private JButton generatePasswordButton;
    private JButton logoutButton;
    private JButton passwordGeneratorButton; 
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public MainScreen(CardLayout cardLayout, JPanel cardPanel) {
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); 

        manageAccountsButton = new JButton("Manage Accounts");
        generatePasswordButton = new JButton("Generate Password");
        logoutButton = new JButton("Logout");
        passwordGeneratorButton = new JButton("Password Generator"); 

        
        Dimension buttonSize = new Dimension(150, 40); 
        manageAccountsButton.setPreferredSize(buttonSize);
        generatePasswordButton.setPreferredSize(buttonSize);
        logoutButton.setPreferredSize(buttonSize);
        passwordGeneratorButton.setPreferredSize(buttonSize); 

    
        Font font = new Font("Arial", Font.PLAIN, 18); 
        manageAccountsButton.setFont(font);
        generatePasswordButton.setFont(font);
        logoutButton.setFont(font);
        passwordGeneratorButton.setFont(font); 

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(manageAccountsButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(generatePasswordButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(passwordGeneratorButton, gbc); 

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(logoutButton, gbc);

        manageAccountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        generatePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        passwordGeneratorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "PasswordGeneratorScreen");
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Logging out...");
                cardLayout.show(cardPanel, "LoginScreen");
            }
        });
    }
}
