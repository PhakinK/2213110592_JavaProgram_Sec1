import java.util.Scanner;

public class StudentScore {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many student in clasroom : ");
		Student[] students = new Student[scanner.nextInt()];
		System.out.println();
		
		for (int i = 0; i < students.length; i++) {
			
			students[i] = new Student();
			
			System.out.print("Input student name : ");
			students[i].setName(scanner.next());
			
			System.out.print("Input student score : ");
			students[i].setScore(scanner.nextInt());
			
			while (!students[i].checkScore()) {
				System.out.print("Input score, again : ");
				students[i].setScore(scanner.nextInt());
			}
					
			System.out.println("--------------------------------");
		}
		
		for (Student student : students)
			if (student.isPass()) 
				System.out.println(">> " + student.getName() + " get grade " + student.findGrade());
			
	}

}
