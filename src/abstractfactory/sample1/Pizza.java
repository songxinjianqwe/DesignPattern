package abstractfactory.sample1;

import abstractfactory.sample1.product.product1.Dough;
import abstractfactory.sample1.product.product2.Clams;
import abstractfactory.sample1.product.product3.Sauce;
/**
 * 抽象产品类
* @ClassName: Pizza
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:53:16
*
 */
public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Clams clams;
	abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place pizza in office PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", clams=" + clams + "]";
	}
	
	
}
