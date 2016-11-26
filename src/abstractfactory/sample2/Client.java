package abstractfactory.sample2;

import abstractfactory.sample2.product.Food;
import abstractfactory.sample2.product.Vehicle;
import abstractfactory.sample2.product.Weapon;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory();
		Vehicle v = factory.createVehicle();
		v.go();
		
		Food food = factory.createFood();
		food.eat();
		
		Weapon weapon = factory.createWeapon();
		weapon.fire();

	}
}
