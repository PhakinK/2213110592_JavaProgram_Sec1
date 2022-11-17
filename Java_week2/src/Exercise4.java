import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Exercise4 {

	public static final double TAX_RATE = .0625D; 
	
	public static void main(String[] args) {
		
		DecimalFormat format1 = new DecimalFormat("##.#");
		DecimalFormat format2 = new DecimalFormat("#.######");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance();
		
		String cdId = JOptionPane.showInputDialog("The program calculates the total cost of a CD order"
				+ "\nPlease enter the ID of CD");
		
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of CD in U.S dollors"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		
		double cdSubTotal = cdPrice * cdQuantity;
		double cdTotal = cdSubTotal * (1 + TAX_RATE);
		
		JOptionPane.showMessageDialog(null, "Summary of the transaction"
				+ "\n\n"
				+ "CD ID: " + cdId
				+ "\nCD Title: " + cdTitle
				+ "\nCD Unit Price: $" + cdPrice
				+ "\nCD Quantity: " + cdQuantity
				+ "\n\n"
				+ "Subtotal: $" + format1.format(cdSubTotal)
				+ "\nTax rate: " + (TAX_RATE * 100) + "%"
				+ "\nTotal: $" + format2.format(cdTotal)
				+ "\n\nEnd of Program");
	}

}
