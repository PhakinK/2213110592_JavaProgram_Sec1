import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI extends JFrame {

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private JLabel labelLength, labelWidth, labelArea, labelPerimeter;
	
	public TestGUI() {
		
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelLength = new JLabel("Enter the length:");
		labelWidth = new JLabel("Enter the width:");
		labelArea = new JLabel("Area:");
		labelPerimeter = new JLabel("Perimeter:");
		
		GridLayout layout = new GridLayout(4,1);
		setLayout(layout);
		
		add(labelArea);
		add(labelLength);
		add(labelPerimeter);
		add(labelWidth);
	}
	
	public static void main(String[] args) {
		new TestGUI();
	}
}
