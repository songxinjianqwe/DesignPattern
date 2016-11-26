package flyweight;
/**
 * 不可共享的部分
* @ClassName: Coordinate
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午10:25:14
*
 */
public class Coordinate {
	private int x;
	private int y;
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	};

}
