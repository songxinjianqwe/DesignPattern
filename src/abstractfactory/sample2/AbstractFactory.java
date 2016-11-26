package abstractfactory.sample2;

import abstractfactory.sample2.product.Food;
import abstractfactory.sample2.product.Vehicle;
import abstractfactory.sample2.product.Weapon;

public interface AbstractFactory {
	Vehicle createVehicle();
	Food createFood();
	Weapon createWeapon();

}
