package composite.sample2;

public class ImageFile implements AbstractFile {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("Í¼Ïñ" + name + "½øÐÐÉ±¶¾!");
	}

}
