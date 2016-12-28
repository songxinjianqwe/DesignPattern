package observer.sample2;

import java.util.ArrayList;
import java.util.List;
/**
 * 气象数据，被观察者
* @ClassName: WeatherData
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:17:19
*
 */
public class WeatherData implements Subject{
	private List<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measuresChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(double temperature,double humidity,double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measuresChanged();
	}

}
