import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab302 {

	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("##.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Input Height: "));
		double BMI = weight / Math.pow((double)height / 100, 2);
		
		String result = "";
		
		if (BMI < 18.5)
			result = "Underweight";
		else if (BMI <= 25)
			result = "Normal-weight";
		else if (BMI <= 30)
			result = "Overweight";
		else if (BMI > 29.9)
			result = "Obesity";
	
		
		JOptionPane.showMessageDialog(null, 
				"BMI = " + format.format(BMI)
				+ "\nYou're " + result , "BMI" , JOptionPane.WARNING_MESSAGE);
		
	}

}
