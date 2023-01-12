import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TempConversion extends JFrame{

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0D/9.0D;
	private static final double CTOP = 9.0D/5.0D;
	private static final double OFFSET = 32;
	
	private JLabel celsiusLabel, fahrenheitLabel;
	private JTextField celsiusTextField, fahrenheitTextField = new JTextField(10);
	
	
	
	public TempConversion() {
		
		centeredFrame(this);
		setTitle("Temperature Conversion");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(1,4));
		
		celsiusLabel = new JLabel("Temp in Celsius: ");
		fahrenheitLabel = new JLabel("Temp in Fahreheit");
		
		celsiusTextField = new JTextField(10);
		fahrenheitTextField = new JTextField(10);
		
		container.add(celsiusLabel);
		container.add(celsiusTextField);
		container.add(fahrenheitLabel);
		container.add(fahrenheitTextField);
		
		celsiusTextField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double celsius,fahrenheit;
				celsius = Double.parseDouble(celsiusTextField.getText());
				fahrenheit = celsius * CTOP + OFFSET;
				fahrenheitTextField.setText(String.format("%.2f" , fahrenheit));
				
			}
		});
		
		fahrenheitTextField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double celsius,fahrenheit;
				fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
				celsius = (fahrenheit - OFFSET) * FTOC; 
				celsiusTextField.setText(String.format("%.2f" , celsius));
				
			}
		});
		
		
	}
	
	public void centeredFrame(JFrame objFrame) {
		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
		int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
		objFrame.setLocation(iCoordX, iCoordY);
	}
	
	public static void main(String[] args) {
		
		new TempConversion();
	}
	

}
