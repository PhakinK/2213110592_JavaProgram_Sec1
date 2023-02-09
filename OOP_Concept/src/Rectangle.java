
public class Rectangle extends Shape {

	private double width, length;
	
	public Rectangle(double width, double length, String color) {
		super(color);
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return width * length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width=" + width + ",length=" + length + "," + super.toString() + "]";
	}

}
