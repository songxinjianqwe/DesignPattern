package observer.sample1;

public class Dad implements Observer{

	@Override
	public void actionToWakeUp(WakeUpEvent event) {
		System.out.println("In "+event.getLoc()+",Dad feed child");
	}

}
