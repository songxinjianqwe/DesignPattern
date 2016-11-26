package observer.sample1;

public class GrandFather implements Observer {

	@Override
	public void actionToWakeUp(WakeUpEvent event) {
		System.out.println("In "+event.getLoc()+",GrandFather feed child");
	}

}
