import javax.swing.JOptionPane;

public class Lab301 {

	public static int PRICE_PER_CUSTOMER = 299;
	
	public static void main(String[] args) {
		
		int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		double totalPrice = PRICE_PER_CUSTOMER * customer;
		int memberCard;
		double totalPriceWithDiscount;
		
		do {
			
			memberCard = JOptionPane.showConfirmDialog(null,
					"Total Price is" + totalPrice + " Baht.",
					"\nDo you have member card?",
					JOptionPane.YES_NO_CANCEL_OPTION);
			
		} while (memberCard == 2);
		
		
		if (memberCard == 0) {
			totalPriceWithDiscount = totalPrice * 90 / 100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPriceWithDiscount + " Baht.");
		} else if (memberCard == 1) {
			
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " Baht.");
		}
		
	}

}
