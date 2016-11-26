package strategy.sample2;
/**
 * 行为接口
* @ClassName: QuackBehaviour
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午12:41:32
*
 */
public interface QuackBehaviour {
	void quack();
}
/**
 * 行为实现类
* @ClassName: Quack
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午12:41:41
*
 */
class Quack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("呱呱!");
	}
}
class MuteQuack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("不会叫~~~~");
	}
}
