
public class WeeklyWeatherData {

	static int NUMDAYS = 7;
	private double[] rainFall = new double[NUMDAYS];
	private double[] avgPressure = new double[NUMDAYS];
	private double avgRain;
	private double maxRain;
	
	public void setData(double[] rain, double[] pressure) {
		this.rainFall = rain;
		this.avgPressure = pressure;
	}
	
	public void calculateStats() {
		maxRain = Integer.MIN_VALUE;
		double rainSum = 0.0;
		//find maximum maxRain and calculate average of rain
		
		for (int i = 0; i < NUMDAYS; i++) {
			if (rainFall[i] > maxRain) {
				maxRain = rainFall[i];
			}
			
			rainSum += rainFall[i];
		}
		
		avgRain = rainSum / NUMDAYS;
		
	}
	
	public double getAvgRain() {
		return avgRain;
	}
	
	public double getMaxRain() {
		return maxRain;
	}
	
}
