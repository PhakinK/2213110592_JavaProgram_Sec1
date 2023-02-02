import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Input movie id\t  : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name  : ");
		String movieName = scan.nextLine();
		System.out.println();
		
		System.out.print("Input director name\t: ");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail\t: ");
		String directorEmail = scan.nextLine();
		System.out.print("Input director gender\t: ");
		String directorGender = scan.nextLine();
		
		while (!directorGender.equalsIgnoreCase("m") && !directorGender.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again\t: ");
			directorGender = scan.nextLine();
		}
		System.out.println();
		
		System.out.print("Input movie theater no.\t : ");
		int theaterNo = scan.nextInt();
		
		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
		
		Theater theater = new Theater(movieId, movieName, new Director(directorName, directorEmail, directorGender.charAt(0)), theaterNo);
		
		System.out.println();
		System.out.println(theater);
	}

}
