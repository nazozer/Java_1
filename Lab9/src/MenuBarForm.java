import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarForm extends JFrame{
    private JPanel panel1;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public MenuBarForm() {
        setTitle("MenuBar Example");
        setSize(450,350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        add(panel1);

        cutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.cut(); } });
        pasteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.paste(); } });
        copyMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.copy();}});

            }

    public static void main(String[] args){
        MenuBarForm z= new MenuBarForm();
        z.setVisible(true);
    }
}










