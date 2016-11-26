package memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Employee e = new Employee("New Song", 20, 0);
		System.out.println(e);
		taker.addMemento(e.memento());
		e.setName("Hehe");
		e.setAge(21);
		e.setSal(2131);
		System.out.println(e);
		e.recovery(taker.getMemento());
		System.out.println(e);
	}

}
