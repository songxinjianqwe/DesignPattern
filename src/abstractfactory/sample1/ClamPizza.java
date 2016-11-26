package abstractfactory.sample1;

import abstractfactory.sample1.factory.PizzaIngredientFactory;
/**
 * 具体产品类
* @ClassName: ClamPizza
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:53:28
*
 */
public class ClamPizza extends Pizza {
	private PizzaIngredientFactory factory;

	public ClamPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * 具体哪一种原料取决于传入的原料工厂的类型
	 * @Title: prepare
	 * @Description: TODO  
	 * @see abstractfactory.sample1.Pizza#prepare()
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		clams = factory.createClams();
	}

}
