package bridge.dimension2;

import bridge.dimension1.Brand;
/**
 * 第二个维度，持有第一个维度的引用
* @ClassName: Computer
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午10:01:47
*
 */
public class Computer {
	protected Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}

}
