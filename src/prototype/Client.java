package prototype;

import java.util.Date;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep s1 = new Sheep("¸ò¸ò", new Date(156553351));
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2.getName());
		System.out.println(s1.getBirthday());
	}	

}
