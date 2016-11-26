package strategy.sample2;
/**
 * ҰѼ
 * @author New Song
 *
 */
public class MallardDuck extends Duck{

	public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		super(flyBehaviour, quackBehaviour);
	}
	
	@Override
	public void display() {
		System.out.println("һֻҰѼ~~~");
	}
}
