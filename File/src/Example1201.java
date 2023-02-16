import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1201 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		
		while(read.hasNext()) {
			
			String name = read.next();
			read.next();
			read.next();
			String mail = read.next();
			
			System.out.println(name + " (" + mail + ")");
		}
		
		
		
	}
}
