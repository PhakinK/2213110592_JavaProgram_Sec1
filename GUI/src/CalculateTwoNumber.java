import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber1.setBounds(30, 36, 115, 30);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber2.setBounds(30, 87, 115, 30);
		contentPane.add(lblNumber2);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(174, 242, 127, 38);
		contentPane.add(lblResult);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(155, 40, 200, 27);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setColumns(10);
		tfNum2.setBounds(155, 91, 200, 27);
		contentPane.add(tfNum2);
	
		
		final JRadioButton radio1 = new JRadioButton("1 digit");
		radio1.setBounds(153, 186, 109, 23);
		contentPane.add(radio1);
		
		final JRadioButton radio2 = new JRadioButton("2 digits");
		radio2.setBounds(153, 212, 109, 23);
		contentPane.add(radio2);
	
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("+");
		comboBox.addItem("-");
		comboBox.addItem("*");
		comboBox.addItem("/");
		comboBox.setBounds(155, 142, 46, 22);
		contentPane.add(comboBox);
		
		final JButton okButton = new JButton("OK");
		
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum;
				
				if (e.getSource() == okButton) {
					num1 = Double.parseDouble(tfNum1.getText());
					num2 = Double.parseDouble(tfNum2.getText());
					
					String operator = (String) comboBox.getSelectedItem();
					
					sum = operator == "+" ? num1 + num2 
							: operator == "-" ? num1 - num2 
							: operator == "*" ? num1 * num2
							: operator == "/" ? num1 / num2 
							: num1 + num2;
					
					DecimalFormat frm = null;
					if (radio1.isSelected())
						frm = new DecimalFormat("#,###.0");
					else if (radio2.isSelected())
						frm = new DecimalFormat("#,###.00");
					
					lblResult.setText(frm.format(sum));
					
				}
				
				
			}
		});
		
		okButton.setBounds(86, 291, 115, 45);
		contentPane.add(okButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(211, 291, 115, 45);
		contentPane.add(exitButton);
		
		JLabel operator = new JLabel("Operator");
		operator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		operator.setBounds(68, 136, 115, 30);
		contentPane.add(operator);
		
		JLabel showMethod = new JLabel("How to show digit");
		showMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		showMethod.setBounds(24, 180, 121, 30);
		contentPane.add(showMethod);
		

		
		
		
		
	}
}
