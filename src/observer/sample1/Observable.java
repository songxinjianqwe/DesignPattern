package observer.sample1;

public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
	void wakeUp();
}
