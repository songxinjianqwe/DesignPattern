package decorator.sample1;
/**
 * 装饰接口
* @ClassName: SuperCar
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:30:57
*
 */
public class SuperCar implements ICar {
	private ICar car;
	public SuperCar(ICar car) {
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
}
