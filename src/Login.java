import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login extends JFrame {
    private JTextField txtMail ;
    private JPanel panelMain ;
    private JPasswordField txtPassword ;
    private JButton btnLogin ;



    public Login() {

        Controller controller = new Controller();

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mail = txtMail.getText();
                String password = new String(txtPassword.getPassword());

                if (mail == null || mail.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mail is required");
                    return;
                }
                if (password == null || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password is required");
                    return;
                }

                // Utilisez la méthode loginUser du contrôleur pour gérer le processus de connexion
                boolean loginSuccessful = false;
                try {
                    loginSuccessful = controller.login(mail, password);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

                if (loginSuccessful) {
                    // Utilisez la méthode getName du contrôleur pour obtenir le nom de l'utilisateur
                    String userName = controller.getName();

                    // Affichez la page de bienvenue avec le nom de l'utilisateur
                    JOptionPane.showMessageDialog(null, "Welcome, " + userName + " !");
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed. Check your credentials.");
                }
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setContentPane(login.panelMain);
        login.setTitle("Login");
        login.setSize(400, 300);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
