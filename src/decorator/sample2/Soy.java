package decorator.sample2;
/**
 * 具体装饰类
* @ClassName: Soy
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:44:21
*
 */
public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
