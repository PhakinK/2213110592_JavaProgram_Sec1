public class Time {
	
	private int second;
	private int minute;
	private int hour;
	
	public Time() {
		second = minute = hour = 0;
	}
	
	public Time(int second, int minute , int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setTime(int second, int minute , int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	public Time nextSecond() {
		
		if (second + 1 == 60) {
			if (minute + 1 == 60) {
				if (hour + 1 == 24) {
					
					second=minute=hour=0;
					
				} else
					hour++;
			} else
				minute++;	
		} else 
			second++;
		
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
}
