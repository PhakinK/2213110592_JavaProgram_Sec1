public class Student {

	private String name;
	private int score;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean checkScore() {
		return score >= 0 && score <= 100;
	}
	
	public boolean isPass() {
		return score >= 50;
	}
	
	public String findGrade() {
		if (score < 50)
			return "F";
		else if (score < 55)
			return "D";
		else if (score < 60)
			return "D+";
		else if (score < 65)
			return "C";
		else if (score < 70)
			return "C+";
		else if (score < 75)
			return "B";
		else if (score < 80)
			return "B+";
		else
			return "A";
	}
}
