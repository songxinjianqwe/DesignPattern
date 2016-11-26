package strategy.Sample2;

public class Client {
	public static void main(String[] args) {
		Duck duck = new MallardDuck(new FlyWithWings(), new Quack());
		duck.performFly();
		duck.performQuack();
		System.out.println();
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
	}
}
