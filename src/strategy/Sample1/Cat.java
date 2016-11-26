package strategy.Sample1;

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
