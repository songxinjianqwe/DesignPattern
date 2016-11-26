package iterator.sample1;
/**
 * 早餐和午餐的菜单采用不同的数据结构存储，但是使用者（招待）希望以统一的方式来处理菜单
 * 
* @ClassName: MenuItem
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午5:17:13
*
 */
public class MenuItem {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
