
public class Theater extends Movie {

	private int theaterNo;
	
	public Theater() {
	}
	
	public Theater(String id, String name, Director director , int theaterNo) {
		super(id, name, director);
		
		this.theaterNo = theaterNo;
	}
	
	public String getTheaterName() {
		
		if (theaterNo > 0 && theaterNo < 12)
			return "Basic Theater";
		else if (theaterNo > 11 && theaterNo < 15)
			return "Sweet Theater";
		else if (theaterNo == 15)
			return "Premium Theater";
		
		return null;
		
	}
	
	@Override
	public String toString() {
		return getTheaterName() + ": " + super.toString();
	}
	
	
}
