package GUIDevelopment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class PizzaPriceCalculator {
	JLabel jlab;
	double price = 0.0;
	PizzaPriceCalculator() {
		
		//Building the initial frame with a size of 300x300 pixels
		JFrame frame = new JFrame("Pizza Price Calculator");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		TitledBorder toppingsTitle;
		toppingsTitle = BorderFactory.createTitledBorder("Toppings");
		
		TitledBorder sizeTitle;
		sizeTitle = BorderFactory.createTitledBorder("Size");
		
		//overlaying a panel onto the frame so that the elements may be manipulated through
		//grid bag methods and constraints
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
	
		//Defining the calculate button and placing/spacing it
		JButton cButton = new JButton("Calculate");
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.insets = new Insets(10,75,-225,0);
		c.gridwidth = 2;
		c.gridx = 2;
		c.gridy = 2;
		mainPanel.add(cButton,c);
		
		//Defining the Exit button and placing/spacing it 
		JButton exitButton = new JButton("Exit");
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.insets = new Insets(10,0,0,0);
		c.gridwidth = 2;
		mainPanel.add(exitButton,c);
		
		//Defining three radio buttons for small/medium/large
		JPanel sizePanel = new JPanel();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		sizePanel.setBorder(sizeTitle);
		
		JRadioButton rButtonS = new JRadioButton("Small");
		sizePanel.add(rButtonS);
		
		JRadioButton rButtonM = new JRadioButton("Medium");
		sizePanel.add(rButtonM);
		
		JRadioButton rButtonL = new JRadioButton("Large");
		sizePanel.add(rButtonL);
		
		mainPanel.add(sizePanel, c);
		
		//Defining the layout for our check boxes/toppings
		GridLayout Toppings = new GridLayout(0,2,5,5);
		JPanel main = new JPanel(Toppings);
		main.setSize(250,250);
		
		//Creating the check boxes for toppings
		JCheckBox checkbox1 = new JCheckBox("Sausage");
		main.add(checkbox1);
		JCheckBox checkbox2 = new JCheckBox("Olives");
		main.add(checkbox2);
		JCheckBox checkbox3 = new JCheckBox("Pepperoni");
		main.add(checkbox3);
		JCheckBox checkbox4 = new JCheckBox("Mushrooms");
		main.add(checkbox4);
		JCheckBox checkbox5 = new JCheckBox("Salami");
		main.add(checkbox5);
		JCheckBox checkbox6 = new JCheckBox("Anchovies");
		main.add(checkbox6);
		c.anchor = GridBagConstraints.CENTER;
		main.setBorder(toppingsTitle);
		mainPanel.add(main, c);
		
		//Creating a new label called price to display the total
		jlab = new JLabel("Price");
		c.anchor = GridBagConstraints.LAST_LINE_START;
		jlab.setBorder(border);
		mainPanel.add(jlab,c);
		
		//Adding the panel to our frame
		frame.add(mainPanel);
		
		//Creating an Action Listener (AL) for our new price label, exit button, and all check/radio buttons
		cButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selected) {
				jlab.setText("Price: " + price);
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				System.exit(0);
			}
		});
		
		checkbox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox1.isSelected())
					price = price + 1.49;
				else 
					price = price - 1.49;
			}
		});
		
		checkbox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox2.isSelected())
					price = price + 0.99;
				else 
					price = price - 0.99;
			}
		});
		
		checkbox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox3.isSelected())
					price = price + 1.49;
				else 
					price = price - 1.49;
			}
		});
		
		checkbox4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox4.isSelected())
					price = price + 0.99;
				else 
					price = price - 0.99;
			}
		});
		
		checkbox5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox5.isSelected())
					price = price + 1.49;
				else 
					price = price - 1.49;
			}
		});
		
		checkbox6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent selected) {
				if (checkbox6.isSelected())
					price = price + 0.99;
				else 
					price = price - 0.99;
			}
		});
		
		rButtonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selected) {
				if (rButtonS.isSelected())
					price = price + 6.99;
				else
					price = price - 6.99;
			}
		});
		
		rButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selected) {
				if (rButtonM.isSelected())
					price = price + 8.99;
				else
					price = price - 8.99;
			}
		});
		
		rButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selected) {
				if(rButtonL.isSelected())
					price = price + 10.99;
				else
					price = price - 10.99;
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent windowEvent){
		       System.exit(0);
		    }
		});
		
}

//Main Function
public static void main(String args[]) {
	SwingUtilities.invokeLater(new Runnable() { 
		public void run(){ new PizzaPriceCalculator(); }});
	}	
}




