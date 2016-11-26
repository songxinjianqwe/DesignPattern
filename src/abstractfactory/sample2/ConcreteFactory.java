package abstractfactory.sample2;

import abstractfactory.sample2.product.AK47;
import abstractfactory.sample2.product.Apple;
import abstractfactory.sample2.product.Car;
import abstractfactory.sample2.product.Food;
import abstractfactory.sample2.product.Vehicle;
import abstractfactory.sample2.product.Weapon;

public class ConcreteFactory implements AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

	@Override
	public Food createFood() {
		return new Apple();
	}

	@Override
	public Weapon createWeapon() {
		return new AK47();
	}

}
