package observer.sample2;

import javax.xml.transform.Templates;

/**
 * 布告板 ，观察者
* @ClassName: CurrentConditionDisplay
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:17:30
*
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions :" + temperature +" F degress and "+ humidity+" % humidity");
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
