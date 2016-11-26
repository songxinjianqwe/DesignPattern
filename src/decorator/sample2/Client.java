package decorator.sample2;

public class Client {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		
	}
}
