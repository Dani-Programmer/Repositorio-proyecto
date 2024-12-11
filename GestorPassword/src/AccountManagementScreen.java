import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountManagementScreen extends JPanel {
    private JTextField serviceField;
    private JPasswordField passwordField;
    private JButton addAccountButton;
    private JButton viewAccountsButton;
    private JButton backButton;

    public AccountManagementScreen() {
        setLayout(new GridLayout(4, 2));

        JLabel serviceLabel = new JLabel("Service Name:");
        serviceField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        addAccountButton = new JButton("Add Account");
        viewAccountsButton = new JButton("View Accounts");
        backButton = new JButton("Back to Main Screen");

        add(serviceLabel);
        add(serviceField);
        add(passwordLabel);
        add(passwordField);
        add(addAccountButton);
        add(viewAccountsButton);
        add(new JLabel());
        add(backButton);

        addAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText();
                String password = new String(passwordField.getPassword());
                // Aquí deberías guardar la cuenta
                JOptionPane.showMessageDialog(null, "Account added successfully.");
            }
        });

        viewAccountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías mostrar las cuentas guardadas
                JOptionPane.showMessageDialog(null, "Viewing accounts...");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías volver a la pantalla principal
            }
        });
    }
}
