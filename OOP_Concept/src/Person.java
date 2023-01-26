
public class Person {

	private String firstName;
	private String lastName;
	
	public Person() {
		this("","");
	}
	
	public Person(String first,String last) {
		setName(first,last);
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	public void setName(String first,String last) {
		firstName = first;
		lastName = last;		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
