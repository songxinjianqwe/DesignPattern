package abstractfactory.sample1.factory;

import abstractfactory.sample1.product.product1.Dough;
import abstractfactory.sample1.product.product2.Clams;
import abstractfactory.sample1.product.product3.Sauce;

/**
 * 抽象工厂
* @ClassName: PizzaIngredientFactory
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:42:40
*
 */
public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Clams createClams();
}
