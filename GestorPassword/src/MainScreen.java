import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JPanel {
    private JButton manageAccountsButton;
    private JButton generatePasswordButton;
    private JButton logoutButton;

    public MainScreen(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new GridLayout(3, 1));

        manageAccountsButton = new JButton("Manage Accounts");
        generatePasswordButton = new JButton("Generate Password");
        logoutButton = new JButton("Logout");

        add(manageAccountsButton);
        add(generatePasswordButton);
        add(logoutButton);

        manageAccountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías cambiar a la pantalla de gestión de cuentas
            }
        });

        generatePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías cambiar a la pantalla de generación de contraseñas
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Logging out...");
                // Aquí deberías cambiar a la pantalla de inicio de sesión
            }
        });
    }
}
