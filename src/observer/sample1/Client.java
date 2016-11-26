package observer.sample1;

public class Client {
	public static void main(String[] args) {
		Observer dad = new Dad();
		Observer gf = new GrandFather();
		Child c = new Child();
		c.addObserver(dad);
		c.addObserver(gf);
		new Thread(c).start();
	}
}
