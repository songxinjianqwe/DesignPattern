package templatemethod.sample1;

/**
 * 茶和咖啡都属于CaffeineBeverage，而且它们的制作流程有部分是相同的，部分是不同的，而且步骤总数是相同的
* @ClassName: CaffeineBeverage
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午4:56:51
*
 */
public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	/**
	 * 这两个方法是不同的
	 * @Title: brew
	 * @Description: TODO
	 * @param    
	 * @return void   
	 * @throws
	 */
	abstract void brew();
	abstract void addCondiments();
	
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
}
