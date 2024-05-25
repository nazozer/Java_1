import javax.swing.JOptionPane;

public class MathOperations {
    public static void main(String[] args) {

        String num1Input = JOptionPane.showInputDialog(null, "Enter the first number:");
        double num1 = Double.parseDouble(num1Input);


        String[] options = { "+", "-", "*", "/" };
        int operationChoice = JOptionPane.showOptionDialog(null,
                "Select an operation:", "Math Operations",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[2]);


        String num2Input = JOptionPane.showInputDialog(null, "Enter the second number:");
        double num2 = Double.parseDouble(num2Input);


        double result = 0;
        String operation = "";

        if (operationChoice == 0) {
            result = num1 + num2;
            operation = "+";
        } else if (operationChoice == 1) {
            result = num1 - num2;
            operation = "-";
        } else if (operationChoice == 2) {
            result = num1 * num2;
            operation = "*";
        } else if (operationChoice == 3) {
            if (num2 != 0) {
                result = num1 / num2;
                operation = "/";
            } else {
                JOptionPane.showMessageDialog(null, "Division by zero is not allowed.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation choice.");
            return;
        }

        JOptionPane.showMessageDialog(null, num1 + " " + operation + " " + num2 + " = " + result);
    }
}