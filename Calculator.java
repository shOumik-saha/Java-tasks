import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener 
{
   private static JTextField inputNumber;
   Calculator(){}
   public static void main(String[] args) 
   {
      createWindow();
   }
   private static void createWindow() {          
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(650,350);            
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Calculator calculator = new Calculator();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
	  panel.setBackground(Color.black);

      inputNumber = new JTextField(5);        
      JButton button0 = new JButton("0");	  
	  button0.setBackground(Color.blue);
	  JButton button1 = new JButton("1");
	  button1.setBackground(Color.blue);
      JButton button2 = new JButton("2");
	  button2.setBackground(Color.blue);
      JButton button3 = new JButton("3");
	  	  button3.setBackground(Color.blue);
      JButton button4 = new JButton("4");
	  	  button4.setBackground(Color.blue);
JButton button5 = new JButton("5");
	  button5.setBackground(Color.blue);
      JButton button6 = new JButton("6");
	  	  button6.setBackground(Color.blue);
JButton button7 = new JButton("7");
	  button7.setBackground(Color.blue);
      JButton button8 = new JButton("8");
	  	  button8.setBackground(Color.blue);
JButton button9 = new JButton("9");
	  button9.setBackground(Color.blue);
	  JButton buttoni = new JButton("i");
	  	  buttoni.setBackground(Color.yellow);
JButton buttonbackward = new JButton("<-");
	  	  buttonbackward.setBackground(Color.yellow);
	  JButton buttonClear = new JButton("C");
	  	  	  buttonClear.setBackground(Color.yellow);
JButton buttonce = new JButton("CE");
	  	  buttonce.setBackground(Color.yellow);
      JButton buttonPlus = new JButton("+");
	  	  	  buttonPlus.setBackground(Color.red);
JButton buttonMinus = new JButton("-");
	  	  	  buttonMinus.setBackground(Color.red);
      JButton buttonDivide = new JButton("/");
	  	  	   buttonDivide.setBackground(Color.red);
	  JButton buttonMultiply = new JButton("*");
	  	  	  	  buttonMultiply.setBackground(Color.red);
      JButton buttonDot = new JButton(".");
	  	  buttonDot.setBackground(Color.blue);
      JButton buttonEquals = new JButton("=");
	  	  	  buttonEquals.setBackground(Color.green);
	  JButton buttonpm = new JButton("+-");
	  	  	  	  buttonpm.setBackground(Color.red);

      button1.addActionListener(calculator);button2.addActionListener(calculator);
      button3.addActionListener(calculator);button4.addActionListener(calculator);
      button5.addActionListener(calculator);button6.addActionListener(calculator);
      button7.addActionListener(calculator);button8.addActionListener(calculator);
      button9.addActionListener(calculator);button0.addActionListener(calculator);
      buttoni.addActionListener(calculator);
	  buttonbackward.addActionListener(calculator);
	  buttonce.addActionListener(calculator);
	  buttonPlus.addActionListener(calculator);buttonMinus.addActionListener(calculator);
      buttonDivide.addActionListener(calculator);buttonMultiply.addActionListener(calculator);
      buttonClear.addActionListener(calculator);buttonDot.addActionListener(calculator);
      buttonEquals.addActionListener(calculator);buttonpm.addActionListener(calculator);
      gbc.fill = GridBagConstraints.HORIZONTAL;
	  gbc.gridx = 0; gbc.gridy = 0; panel.add(inputNumber, gbc);        
      gbc.gridx = 0; gbc.gridy = 1; panel.add(buttoni, gbc);        
      gbc.gridx = 1; gbc.gridy = 1; panel.add(buttonbackward, gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(buttonClear, gbc);
      gbc.gridx = 3; gbc.gridy = 1; panel.add(buttonce, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(button7, gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(button8, gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(button9, gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(buttonDivide, gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(button4, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(button5, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(button6, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(buttonMultiply, gbc);
      gbc.gridx = 0; gbc.gridy = 4; panel.add(button1, gbc);
      gbc.gridx = 1; gbc.gridy = 4; panel.add(button2, gbc);
      gbc.gridx = 2; gbc.gridy = 4; panel.add(button3, gbc);
      gbc.gridx = 3; gbc.gridy = 4; panel.add(buttonMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 5; panel.add(button0, gbc);
      gbc.gridx = 1; gbc.gridy = 5; panel.add(buttonpm, gbc);
      gbc.gridx = 2; gbc.gridy = 5; panel.add(buttonDot, gbc);
      gbc.gridx = 3; gbc.gridy = 5; panel.add(buttonPlus, gbc);

      gbc.gridx = 2; gbc.gridy = 6; panel.add(buttonEquals, gbc);
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }
   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') 
	  {                      
         inputNumber.setText("");
      }
	  else if (command.charAt(0) == '=') 
	  {                    
         inputNumber.setText(evaluate(inputNumber.getText()));
      }
	  else
	  {                                
         inputNumber.setText(inputNumber.getText() + command);
      }
   }
   public static String evaluate(String expression) 
   {
      char[] arr = expression.toCharArray();
      String x = "";String y = "";String operator = "";
      double result = 0;
      for (int i = 0; i < arr.length; i++) 
	  {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
		 {
            if(operator.isEmpty())
			{
               x += arr[i];
            }
			else
			{
               y += arr[i];
            }
         }  
         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') 
		 {
            operator += arr[i];
         }
      }
      if (operator.equals("+"))
         result = (Double.parseDouble(x) + Double.parseDouble(y));
      else if (operator.equals("-"))
         result = (Double.parseDouble(x) - Double.parseDouble(y));
      else if (operator.equals("/"))
         result = (Double.parseDouble(x) / Double.parseDouble(y));
      else
         result = (Double.parseDouble(x) * Double.parseDouble(y));          
      return x + operator + y + "=" +result;
   }    
}