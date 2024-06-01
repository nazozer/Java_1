import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    private JTextField ENTERCOURSETextField;
    private JButton buttonAdd;
    private JButton buttonRemove;
    private JList<String> courseList1;
    private JList<String> courseList2;
    private JPanel mainPanel;

    private DefaultListModel<String> listModel1;
    private DefaultListModel<String> listModel2;

    public Form() {

        listModel1 = new DefaultListModel<>();
        courseList1.setModel(listModel1);

        listModel2 = new DefaultListModel<>();
        courseList2.setModel(listModel2);

        DefaultListCellRenderer renderer = new DefaultListCellRenderer(){
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (component instanceof JLabel) {
                    JLabel label = (JLabel) component;
                    label.setFont(new Font("Arial", Font.BOLD, 16));
                    label.setForeground(Color.WHITE);
                }
                return component;
            }
        };
         courseList1.setCellRenderer(renderer);
         courseList2.setCellRenderer(renderer);

        ENTERCOURSETextField.setFont(new Font("Arial",Font.BOLD,13));
        ENTERCOURSETextField.setForeground(Color.BLACK);


        courseList1.setBackground(Color.BLUE);
        courseList2.setBackground(Color.YELLOW);


        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCourse();

            }
        });
        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeAndTransferCourse();

            }
        });
    }


    private void addCourse() {
        String courseName = ENTERCOURSETextField.getText();
        if (!courseName.isEmpty()) {
            listModel1.addElement(courseName);
            ENTERCOURSETextField.setText("");

        }
    }

    private void removeAndTransferCourse() {
        int selectedIndex = courseList1.getSelectedIndex();
        if (selectedIndex != -1) {
            String selectedCourse = listModel1.getElementAt(selectedIndex);
            listModel1.removeElementAt(selectedIndex);
            listModel2.addElement(selectedCourse);

            courseList1.setBackground(Color.RED);
            courseList2.setBackground(Color.GREEN);

            courseList1.repaint();
            courseList2.repaint();

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Course Manager");
        frame.setContentPane(new Form().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}



