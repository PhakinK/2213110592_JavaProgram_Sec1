public class TestStudent {
	
	public static void main(String[] args) {
		
		Student vissava = new Student("Visava Leklai" , "Pattanakarn");
		
		System.out.println(vissava);
		
		vissava.setAddress("Pattanakarn 37");
		System.out.println(vissava);
		System.out.println(vissava.getName());
		System.out.println(vissava.getAddress());
		
		vissava.addCourseGrade("INT107", 95);
		vissava.addCourseGrade("INT108", 100);
		vissava.addCourseGrade("MSC-202", 98);
		vissava.printGrade();
		
		System.out.printf("The average grade is %.2f%n" , vissava.getAverageGrade());
	}

}
