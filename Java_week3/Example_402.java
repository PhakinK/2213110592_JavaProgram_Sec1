import javax.swing.JOptionPane;

public class Example_402 {

	public static void main(String[] args) {
		
		String mail = JOptionPane.showInputDialog("Input your e-mail");
		while (mail.startsWith("@") || mail.startsWith(" ")) {
			mail = JOptionPane.showInputDialog("Input your e-mail,again");
		}
		mail = mail.toLowerCase();
		
		/*
		if (mail.endsWith("@gmail.com") || mail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null ,  "Your email is " + mail");
		} else {
			JOptionPane.showMessageDialog(null ,  "Your email isn't hotmail or gmail dot com");
		}
		*/
		
		boolean checkMail = mail.endsWith("@gmail.com") || mail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null ,  checkMail 
				? "Your email is " + mail
				: "Your email isn't hotmail or gmail dot com");
	
		
	}
}
