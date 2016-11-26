package abstractfactory.sample1;


public class Client {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a "+ pizza.getName());
		System.out.println(pizza);
		System.out.println();
		
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a + "+pizza.getName());
		System.out.println(pizza);
	}
}
