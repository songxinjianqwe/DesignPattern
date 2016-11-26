package composite.sample2;

public class Client {
	public static void main(String[] args) {
		Folder root = new Folder("root");
		root.add(new ImageFile("jpg1"));
		root.add(new TextFile("txt1"));
		Folder f1 = new Folder("f1");
		root.add(f1);
		f1.add(new TextFile("txt2"));
		Folder f2 = new Folder("f2");
		f1.add(f2);
		Folder f3 = new Folder("f3");
		f2.add(f3);
		f3.add(new ImageFile("jpg2"));
		root.killVirus();
	}
}
