package composite.sample1;
/**
 * 有菜单和菜单项，他们的共同父类是MenuComponent
 * Waitress以相同的形式来操纵菜单和菜单项
* @ClassName: MenuComponent
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午7:49:51
* 
 */
public abstract class MenuComponent {
	
	/**
	 * 以下三个是属于结点（相对于树叶）的操作
	 * @Title: add
	 * @Description: TODO
	 * @param @param menuComponent   
	 * @return void   
	 * @throws
	 */
	public void add(MenuComponent menuComponent){
		
	}
	
	public void remove(MenuComponent menuComponent){
		
	}
	
	public MenuComponent getChild(int index){
		return null;
	}
	
	/**
	 * 以下是属于叶子的操作
	 * @Title: getName
	 * @Description: TODO
	 * @param @return   
	 * @return String   
	 * @throws
	 */
	
	public String getName(){
		return null;
	}
	
	public String getDescription(){
		return null;
	}
	
	public double getPrice(){
		return 0;
	}
	
	public boolean isVegetarian(){
		return false;
	}
	
	public void print(){
		
	}
	
}
