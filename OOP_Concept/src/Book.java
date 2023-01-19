import java.time.Year;

public class Book {
	
	private String title;
	private float price;
	private int publishyear;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
	
	public int getTotalYear() {
		return Year.now().getValue() - publishyear;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + " published for " + getTotalYear() + " year (" + price + " baht).";
	}

}
