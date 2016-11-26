package observer.sample2;

public class Client {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionDisplay display = new CurrentConditionDisplay(data);
		data.setMeasurements(80, 65, 30.4);
		data.setMeasurements(82, 70, 29.2);
		
	}
}
