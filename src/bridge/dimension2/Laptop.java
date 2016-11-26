package bridge.dimension2;

import bridge.dimension1.Brand;

public class Laptop extends Computer{
	public Laptop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
	
}
