package abstractfactory.sample1.factory;

import abstractfactory.sample1.product.product1.Dough;
import abstractfactory.sample1.product.product1.ThickCrustDough;
import abstractfactory.sample1.product.product2.Clams;
import abstractfactory.sample1.product.product2.FrozenClams;
import abstractfactory.sample1.product.product3.PlumTomatoSauce;
import abstractfactory.sample1.product.product3.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
