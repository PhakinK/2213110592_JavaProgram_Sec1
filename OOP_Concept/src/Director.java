
public class Director {
	
	private String name;
	private String eMail;
	private char gender;
	
	public Director(String name, String eMail) {
		this.name = name;
		this.eMail = eMail;
	}
	
	public Director(String name, String eMail, char gender) {
		this.name = name;
		this.eMail = eMail;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return eMail;
	}

	public String getGenderName() {
		
		if (gender == 'M' || gender == 'm')
			return "Male";
		else if (gender == 'F' || gender == 'f')
			return "Female";
		else 
			return null;
		
	}
	
	@Override
	public String toString() {
		return name + " (" + eMail + ";" + getGenderName() + ")";
	}
	
	
	
	
	
	

}
