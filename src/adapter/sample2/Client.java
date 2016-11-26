package adapter.sample2;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		testTarget(adapter);
	}
	
	public static void testTarget(Target target){
		target.handleRequest();
	}
}
