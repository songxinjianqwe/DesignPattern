package bridge;


import bridge.dimension1.Brand;
import bridge.dimension1.Lenovo;
import bridge.dimension2.Computer;
import bridge.dimension2.Desktop;

public class Client {
	public static void main(String[] args) {
		Brand b = new Lenovo();
		Computer c = new Desktop(b);
		c.sale();
	}

}
