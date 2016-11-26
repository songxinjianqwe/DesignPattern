package strategy.Sample2;
//行为接口
public interface QuackBehaviour {
	void quack();
}
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
