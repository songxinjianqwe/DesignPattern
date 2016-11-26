package memento;

import java.util.LinkedList;

public class CareTaker {
	private LinkedList<EmpMemento> list = new LinkedList<>();
	public void addMemento (EmpMemento memento) {
		this.list.add(memento);
	}
	public EmpMemento getMemento() {
		return list.removeLast();
	}

}
