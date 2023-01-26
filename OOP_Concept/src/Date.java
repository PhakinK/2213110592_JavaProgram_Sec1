public class Date {
	
	private int dateMonth;
	private int dateDay; 
	private int dateYear; 


	public Date() {
		this(1,1,1900);
	}

	public Date(int month, int day, int year) {
		dateMonth = month;
		dateDay = day;
		dateYear = year;
	}


	public void setDate(int month, int day, int year) {
		dateMonth = month;
		dateDay = day;
		dateYear = year;
	}


	public int getMonth() {
		return dateMonth;
	}


	public int getDay() {
		return dateDay;
	}


	public int gerYear() {
		return dateYear;
	}

	@Override
	public String toString() {
		return getMonth() + "-" + getDay() + "-" + gerYear();
	}

}