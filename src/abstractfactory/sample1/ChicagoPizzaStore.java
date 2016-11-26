package abstractfactory.sample1;

import abstractfactory.sample1.factory.ChicagoIngredientFactory;
import abstractfactory.sample1.factory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
	private PizzaIngredientFactory factory = new ChicagoIngredientFactory();
	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		if(item.equals("clam")){
			pizza = new ClamPizza(factory);
			pizza.setName("Chicago Style Clam Pizza");
		}else {
			//其他种类
		}
		return pizza;
	}

}
