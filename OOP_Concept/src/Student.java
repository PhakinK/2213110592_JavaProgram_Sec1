public class Student {
	
	private static final int MAX_COURSES = 30;
	
	private String name;
	private String address;
	private int numCoures;
	private String[] courses;
	private int[] grades;
	
	public Student(String name, String address) {
		
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCoures] = course;
		grades[numCoures] = grade;
		
		numCoures++;
	}
	
	public void printGrade() {
		System.out.println(name);
		
		for (int i = 0; i < MAX_COURSES; i++)
			System.out.println(" " + courses[i] + ":" + grades[i]);
		
		
		System.out.println();
	}
	
	public double getAverageGrade() {
		
		int totalGrade = 0;
		
		for (int i = 0; i < MAX_COURSES; i++)
			totalGrade += grades[i];
		
		return (double) totalGrade / numCoures;
	}
	
	@Override
	public String toString() {
		return name + " (" + address + ")";
	}

}
