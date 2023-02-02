
public class Point2D {
	
	protected static float DEFAULT_X = 0.0F;
	protected static float DEFAULT_Y = 0.0F;

	private float x;
	private float y;
	
	public Point2D() {
		x = DEFAULT_X;
		y = DEFAULT_Y;
	}
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x , float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY() {
		return new float[] {x , y};
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
