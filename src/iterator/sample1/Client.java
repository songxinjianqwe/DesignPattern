package iterator.sample1;

public class Client {
	public static void main(String[] args) {
		PanackeHouseMenu pancakeHouseMenu =  new PanackeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}
