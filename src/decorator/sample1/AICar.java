
package decorator.sample1;

public class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);
	}
	public void autoDrive(){
		System.out.println(this.getClass().getSimpleName()+" ×Ô¶¯¼ÝÊ»");
	}
	@Override
	public void move() {
		super.move();
		autoDrive();
	}
	
}
