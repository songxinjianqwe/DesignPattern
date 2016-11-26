package composite.sample2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {
	private String name;
	private List<AbstractFile> list = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile get(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("文件夹" + name + "进行杀毒!");
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}
}
