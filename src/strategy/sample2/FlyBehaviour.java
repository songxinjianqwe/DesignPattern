package strategy.sample2;
/**
 * 行为接口
* @ClassName: FlyBehaviour
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午12:42:12
*
 */
public interface FlyBehaviour {
	void fly();
}
/**
 * 行为实现类
* @ClassName: FlyNoWay
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午12:42:17
*
 */
class FlyNoWay implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("我飞不起来!");
	}
}
class FlyWithWings implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("我用翅膀飞!");
	}
}
class FlyWithRocketPowered implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("火箭加速器助推飞行!");
	}
	
}