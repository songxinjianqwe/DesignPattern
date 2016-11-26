package decorator.sample2;
/**
 * 具体饮料类
* @ClassName: Espresso
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:40:09
*
 */
public class Espresso extends Beverage {
	public Espresso() {
		this.desc = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	

}
