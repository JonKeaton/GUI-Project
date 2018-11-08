package GUIDevelopment;
import java.awt.*;
import javax.swing.*;

public class PizzaPriceCalculator {
	PizzaPriceCalculator() {
		JFrame frame = new JFrame("Pizza Price Calculator");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
	
		JButton button = new JButton("Exit");
		c.ipady = 0;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.insets = new Insets(10,0,0,0);
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 2;
		mainPanel.add(button,c);
		
		JButton exitButton = new JButton("Calculate");
		
			
		
		c.ipady = 0;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,0,0,57);
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 2;
		mainPanel.add(exitButton,c);
		
		JRadioButton rButtonS = new JRadioButton("Small");
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		mainPanel.add(rButtonS,c);
		
		JRadioButton rButtonM = new JRadioButton("Medium");
		c.anchor = GridBagConstraints.PAGE_START;
		mainPanel.add(rButtonM,c);
		
		JRadioButton rButtonL = new JRadioButton("Large");
		c.anchor = GridBagConstraints.FIRST_LINE_END;
		mainPanel.add(rButtonL,c);
		
		GridLayout Toppings = new GridLayout(0,2,5,5);
		JPanel main = new JPanel(Toppings);
		main.setSize(250,250);
		main.add(new JCheckBox("Sausage"));
		main.add(new JCheckBox("Pepperoni"));
		main.add(new JCheckBox("Salami"));
		main.add(new JCheckBox("Olives"));
		main.add(new JCheckBox("Mushrooms"));
		main.add(new JCheckBox("Anchovies"));
		c.anchor = GridBagConstraints.CENTER;
		mainPanel.add(main, c);
		
	
		
		frame.add(mainPanel);
	

	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() { 
		      public void run(){ new PizzaPriceCalculator(); }});
	}
		
	
}
