package factorymethod.sample;
/**
 * 一种具体的产品类
* @ClassName: NYStyleCheesePizza
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:16:04
*
 */
public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
	}
	
}
