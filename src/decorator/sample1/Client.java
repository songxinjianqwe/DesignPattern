package decorator.sample1;

public class Client {
	public static void main(String[] args) {
		ICar car = new Car();
		car.move();
		System.out.println();
		
		SuperCar flyCar = new AirCar(car);
		flyCar.move();
		System.out.println();
		
		SuperCar aiCar = new AICar(car);
		aiCar.move();
		
	}
}
