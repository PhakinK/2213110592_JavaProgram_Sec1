import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example1202 {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Input section: ");
		int section = input.nextInt();
		header(section);
		showListStudent(section);
		
	}
	
	
	private static void showListStudent(int sec) throws IOException {
		
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		
		while ((temp = read.readLine()) != null) {
			
			String[] data = temp.split("\t");
			float midtermScore = Float.parseFloat(data[4]);
			float finalScore = Float.parseFloat(data[5]);
			
			if (Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0] + "\t" + data[2] + "\t" + midtermScore + "\t" + finalScore + "\t" + findResult(midtermScore , finalScore));
			}
			
		}
		
	}
	
	private static String findResult(float midtermScore , float finalScore) {
		return midtermScore + finalScore > 40 ? "PASS" : "FAIL";
	}
	
	private static void header(int section) {
		System.out.println("********************************************************************");
		System.out.println("\t\tList of Data for Section " + section);
		System.out.println("********************************************************************");
	}
}
