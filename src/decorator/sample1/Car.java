package decorator.sample1;
/**
 * 被装饰对象
* @ClassName: Car
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:30:36
*
 */
public class Car implements ICar{

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName()+" 在陆地上行驶");
	}

}
