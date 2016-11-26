package observer.sample1;

import java.util.ArrayList;
import java.util.List;

public class Child implements Observable ,Runnable{
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
		for(Observer o:observers){
			o.actionToWakeUp(event);
		}
	}

	@Override
	public void wakeUp() {
		System.out.println("I wake up!");
		notifyObservers();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			wakeUp();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
