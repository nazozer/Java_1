import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Sayı Gösterimi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);


        JRadioButton divisibleBy3And5 = new JRadioButton("3 ve 5'e Bölünebilenler");
        JRadioButton primeNumbers = new JRadioButton("Asal Sayılar");


        ButtonGroup group = new ButtonGroup();
        group.add(divisibleBy3And5);
        group.add(primeNumbers);


        JButton displayButton = new JButton("Göster");


        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                if (divisibleBy3And5.isSelected()) {
                    displayDivisibleBy3And5(textArea);
                } else if (primeNumbers.isSelected()) {
                    displayPrimeNumbers(textArea);
                }
            }
        });


        panel.add(divisibleBy3And5);
        panel.add(primeNumbers);
        panel.add(displayButton);
        panel.add(new JScrollPane(textArea));


        frame.add(panel);


        frame.setVisible(true);
    }


    private static void displayDivisibleBy3And5(JTextArea textArea) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append(i).append("\n");
            }
        }
        textArea.setText(result.toString());
    }


    private static void displayPrimeNumbers(JTextArea textArea) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                result.append(i).append("\n");
            }
        }
        textArea.setText(result.toString());
    }


    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
