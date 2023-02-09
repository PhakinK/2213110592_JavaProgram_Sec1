import java.util.Scanner;

public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input width : ");
		double width = scan.nextDouble();
		System.out.println("Input length : ");
		double length = scan.nextDouble();
		
		Rectangle2 rectangle2 = new Rectangle2(width , length);
		System.out.println(rectangle2);
	}

}
