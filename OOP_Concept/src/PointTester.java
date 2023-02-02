public class PointTester {

	public static void main(String[] args) {
		
		Point2D point2d = new Point2D();
		
		System.out.println("Default x, y of Point2D = " + point2d);
		point2d.setXY(10.0F , 11.0F);
		System.out.println("x, y of Point2D = " + point2d);
		System.out.println("x of Point2D is: " + point2d.getX());
		System.out.println("y of Point2D is: " + point2d.getY());
		
		Point3D point3d = new Point3D();
		
		System.out.println("Default x, y and z of Point3D = " + point3d);
		
		point3d.setXYZ(10.0F , 12.0F , 7.0F);
		System.out.println("x, y and z of Point3D = " + point3d);
		System.out.println("x of Point3D is: " + point3d.getX());
		System.out.println("y of Point3D is: " + point3d.getY());
		System.out.println("z of Point3D is: " + point3d.getZ());
		
	}
	
}
