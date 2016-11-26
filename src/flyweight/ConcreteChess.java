package flyweight;
/**
 * 具体享元类(可以共享的部分)
* @ClassName: ConcreteChess
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午10:24:33
*
 */
public class ConcreteChess implements Chess{
	private String color;
	public ConcreteChess(String color) {
		this.color = color;
	}
	
	@Override
	public void display(Coordinate c) {
		System.out.println("落"+color+"子于"+c.getX()+","+c.getY());
	}

	@Override
	public String getColor() {
		return color;
	}

}
