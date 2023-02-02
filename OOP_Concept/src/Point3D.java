
public class Point3D extends Point2D {
	
	protected static final float DEFAULT_Z = 0.0F;
	
	private float z;
	
	public Point3D(float x , float y , float z) {
		super(x,y);
		this.z = z;
	}
	
	public Point3D() {
		super(Point2D.DEFAULT_X , Point2D.DEFAULT_Y);
		z = DEFAULT_Z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x , float y , float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		return new float[] {super.getX() , super.getY() , z};
	}
	
	@Override
	public String toString() {
		return super.toString() + ", and " + getZ();
	}

}
