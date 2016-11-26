package factorymethod.sample;
/**
 * 抽象产品类
* @ClassName: Pizza
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:15:27
*
 */
public abstract class Pizza {
	protected String name;
	protected String dough;//面团类型
	protected String sauce;//酱料
	public void prepare(){
		System.out.println("Preparing "+ name);
		System.out.println("Tossing dough..."+dough);
		System.out.println("Adding sauce..."+sauce);
		
	}
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place pizza in office PizzaStore box");
	}
	public String getName(){
		return this.name;
	}
	
	
}
