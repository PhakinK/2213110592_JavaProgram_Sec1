import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius , null);
		System.out.println();
		System.out.println(circle);
		System.out.println("Circle[area=" + circle.getArea() + "]");
		
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("\n" + cylinder);
		System.out.println("Cylinder[area=" + cylinder.getArea() + "]");
		System.out.println("Cylinder[volume=" + cylinder.getVolume() + "]");
	}

}
