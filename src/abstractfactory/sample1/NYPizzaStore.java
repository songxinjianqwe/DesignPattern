package abstractfactory.sample1;

import abstractfactory.sample1.factory.NYPizzaIngredientFactory;
import abstractfactory.sample1.factory.PizzaIngredientFactory;
/**
 * 具体创建者
* @ClassName: NYPizzaStore
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:52:42
*
 */
public class NYPizzaStore extends PizzaStore {
	private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}else {
			//其他种类
		}
		return pizza;
	}
}
