package composite.sample1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	private String name;
	private String description;
	private ArrayList<MenuComponent> menuComponent = new ArrayList<>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		this.menuComponent.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		this.menuComponent.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int index) {
		return menuComponent.get(index);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.print("\n " + name);
		System.out.println(", " + description);
		System.out.println("------------------");
		Iterator<MenuComponent> it = menuComponent.iterator();
		while(it.hasNext()){
			it.next().print();
		}
	}
	
}
