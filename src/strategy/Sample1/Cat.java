package strategy.Sample1;
/**
 * bean
* @ClassName: Cat
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午12:42:38
*
 */
public class Cat {
	private int height;
	private int weight;
	public Cat(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Cat [height=" + height + ", weight=" + weight + "]";
	}
}
