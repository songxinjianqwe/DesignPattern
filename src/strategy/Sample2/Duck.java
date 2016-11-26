package strategy.Sample2;
//鸭子的超类

//含有所有鸭子都包含的行为swim和display
//但是不同鸭子的fly和quack行为是不同的
//设计原则1：找出应用中可能需要变化之处，把它们独立出来，不要和那么不需要变化的代码混在一起
//将fly和quack（呱呱叫）的行为抽取出来，建立一组新类来代表各个行为
//设计原则2：针对接口编程，而不是针对实现编程
//行为最好定义为接口，由不同的行为类来实现行为接口（而不是Duck类来）
//设计原则3：多用组合，少用继承
//Duck类中持有fly和quack行为接口，这样的话行为就与Duck类无关了

//可以将Duck设计为接口，这样就分离开不同的fly和quack行为了，缺点是无法实现相同的代码复用
//如果有变化的部分，可以让子类去实现，比如定义抽象方法；但是如果要实时变化这个部分，抽象方法就无能为力了。
//比如一个鸭子的子类，可以一开始让它以一种方式飞行，又可以改变它的飞行方式（在不修改既有代码的前提下）
//如果是接口让子类去实现，那么只能有一种策略，想要换一种策略就需要修改代码

public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		super();
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}

	public void swim() {
		System.out.println("我们都会游泳！");
	}

	public abstract void display();// 不同的鸭子的显示效果不同

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}
}
