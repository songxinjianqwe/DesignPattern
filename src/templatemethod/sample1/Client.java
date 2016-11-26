package templatemethod.sample1;

public class Client {
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		System.out.println();
		
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
		
	}
}	
