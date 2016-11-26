package strategy.Sample2;
//行为接口
public interface FlyBehaviour {
	void fly();
}
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