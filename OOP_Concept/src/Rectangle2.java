
public class Rectangle2 implements Shape2 {
	
	private double width, length;

	public Rectangle2(double width, double length) {
	
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
		return "Rectangle[width=" + width + ",length=" + length + ",color=" + color + "]";
	}

}
