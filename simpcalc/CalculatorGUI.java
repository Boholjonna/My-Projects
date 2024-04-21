


package simpcalc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorGUI {
    private  Calculator calculator;
    private   JTextField inputField;
    
    public CalculatorGUI(){
        JFrame frame = new JFrame ("Jonna's Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(340, 340);
        
        
        Panel panel = new Panel();
      panel.setBackground(new Color(25, 25, 112));
        panel.setLayout(null);
        frame.add(panel);
        inputField = new JTextField();
        inputField.setBounds(10, 10, 310, 50);
        inputField.setFont(new Font("Arial", Font.PLAIN, 25)); 
          inputField.setForeground(Color.RED);
        panel.add(inputField);
    
    
    String [] buttonLabels = {"7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", "C", "=", "0", "/"};
        JButton [] buttons = new JButton [buttonLabels.length];
    
    
    
    int x=10, y=70;
    
     for (int i = 0; i < buttonLabels.length; i++) {
    String label = buttonLabels[i];
       buttons[i] = new JButton(label);
            buttons[i].setBounds(x, y, 70, 50);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 26));
              buttons[i].setBackground(new Color(127, 255, 212));
            panel.add(buttons[i]);
            x += 80;
    if ((i + 1) % 4 == 0){
        x=10;
        y+=60;
    }
    
    buttons[i].addActionListener(e -> {
                if (label.equals("=")) {
                    evaluate();
                } else if (label.equals("C")) {
                    clear();
                } else {
                    inputField.setText(inputField.getText() + label);
                }
            });
}

        frame.setVisible(true);
    }

public void setCalculator(Calculator calculator){
this.calculator = calculator;

}

public void evaluate(){
String expression = inputField.getText();
String [] parts = expression.split("[+\\-×/]");

double result = Integer.parseInt(parts[0]);





for (int i = 1; i < parts.length; i++){
char operator = expression.charAt(parts[i - 1].length());
double operand = Double.parseDouble(parts[i]);

switch(operator){

                    case '+':
                    result = calculator.add(result, operand);
                    break;
                case '-':
                    result = calculator.subtract(result, operand);
                    break;
                case '×':
                    result = calculator.multiply(result, operand);
                    break;
                case '/':
                    try {
                        result = calculator.divide(result, operand);
                        
                    } catch (ArithmeticException e) {
                        inputField.setText("Error: " + e.getMessage());
                        return;
                    }
                    break;
                   



}


}

inputField.setText(Double.toString(result));
    }

    private void clear() {
        inputField.setText("");
    }
    
    
    
    
}







 

    

