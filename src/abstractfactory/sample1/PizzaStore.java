package abstractfactory.sample1;
/**
 * 创建者抽象类
* @ClassName: PizzaStore
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:10:45
*
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String type);
}
