package adapter.sample2;

public class Adapter implements Target {
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void handleRequest() {
		adaptee.request();
	}

}
