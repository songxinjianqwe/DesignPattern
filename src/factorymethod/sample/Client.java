package factorymethod.sample;

public class Client {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+ pizza.getName());
		System.out.println();
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a + "+pizza.getName());
		
	}
}
