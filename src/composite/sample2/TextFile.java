package composite.sample2;

public class TextFile implements AbstractFile {
	private String name;
	public TextFile(String name) {
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
		System.out.println("文本" + name + "进行杀毒!");
	}

}
