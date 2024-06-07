import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton enterButton;
    private JButton goToJMenuBarButton;
    private JPanel mainPanel;

    public MainForm() {
        setTitle("JTabbedPane Example");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(mainPanel);


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                String pass = passwordField1.getText();
                if (text.equals("nazlı") && pass.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else if (!text.equals("nazlı") && pass.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login Name is WRONG");
                } else if (text.equals("nazlı")) {
                    JOptionPane.showMessageDialog(null, "Password is WRONG");
                } else {
                    JOptionPane.showMessageDialog(null, "Login name or password is wrong");
                }
                tabbedPane1.setSelectedIndex(0);
            }
        });
        goToJMenuBarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuBarForm x = new MenuBarForm();
                x.setVisible(true);
            }

        });
    }

        public static void main (String[]args){
            MainForm y = new MainForm();
            y.setVisible(true);

        }
    }



