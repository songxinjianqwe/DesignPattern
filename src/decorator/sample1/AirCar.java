package decorator.sample1;
/**
 * 具体装饰类
* @ClassName: AirCar
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:32:10
*
 */
public class AirCar extends SuperCar {

	public AirCar(ICar car) {
		super(car);
	}
	//新增方法
	public void fly(){
		System.out.println(this.getClass().getSimpleName()+" 飞行");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}
