package decorator.sample2;
/**
 * 具体装饰类
* @ClassName: Mocha
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:41:43
*
 */
public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" ,Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
