package iterator.sample1;

import java.util.ArrayList;

import iterator.sample1.iterators.ArrayListIterator;
import iterator.sample1.iterators.Iterator;

public class PanackeHouseMenu implements Menu{
	private ArrayList<MenuItem> menuItems;

	public PanackeHouseMenu() {
		menuItems = new ArrayList<>();
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);
	}

	public Iterator createIterator() {
		return new ArrayListIterator(menuItems);
	}
}
