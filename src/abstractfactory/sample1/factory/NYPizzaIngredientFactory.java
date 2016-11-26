package abstractfactory.sample1.factory;

import abstractfactory.sample1.product.product1.Dough;
import abstractfactory.sample1.product.product1.ThinCrustDough;
import abstractfactory.sample1.product.product2.Clams;
import abstractfactory.sample1.product.product2.FreshClams;
import abstractfactory.sample1.product.product3.MarinearaSauce;
import abstractfactory.sample1.product.product3.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinearaSauce();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}
}
