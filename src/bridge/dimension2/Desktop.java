package bridge.dimension2;

import bridge.dimension1.Brand;

public class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}
