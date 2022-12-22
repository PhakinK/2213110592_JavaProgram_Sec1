public class PiggyBank {

	public int one, two, five, ten;
	public int size;
	
	public void setPiggyBank(int size) {
		this.size = size;
		clear();
	}
	
	public void clear() {
		one = two = five = ten = 0;
	}
	
	public void addOne(int c) {
		if (getTotal() + c > size) {
			System.err.println("Piggy Bank Full");
			return;
		}
		
		this.one += c;
	}
	
	public void addTwo(int c) {
		if (getTotal() + c*2 > size) {
			System.err.println("Piggy Bank Full");
			return;
		}
		
		this.two += c;
	}
	
	public void addFive(int c) {
		if (getTotal() + c*5 > size) {
			System.err.println("Piggy Bank Full");
			return;
		}
		
		this.five += c;
	}
	
	public void addTen(int c) {
		if (getTotal() + c*10 > size) {
			System.err.println("Piggy Bank Full");
			return;
		}
		
		this.ten += c;
	} 
	
	public int getSize() {
		return size;
	}
	
	public int getTotal() {
		return one + (two * 2) + (five * 5) + (ten * 10);
	}
}
