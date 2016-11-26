package decorator.sample2;
/**
 * 星巴克咖啡  有饮料和调料
 * 咖啡是被装饰类
 * 共同继承自Beverage类
 * 
 * 调料是装饰类
 * 共同实现cost方法
 * 
* @ClassName: Beverage
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:36:30
*
 */
public abstract class Beverage {
	protected String desc = "Unknown Beverage";
	
	public String getDescription(){
		return this.desc;
	}
	public abstract double cost();
}

