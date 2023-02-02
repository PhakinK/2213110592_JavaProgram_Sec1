
public class Product {

	private int unit;
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public int getTotalPrice() {
		return this.unit * 100;
	}
	
	@Override
	public String toString() {
		return "You buy " + getUnit() + " units (" + getTotalPrice() + ")";
	}
}
