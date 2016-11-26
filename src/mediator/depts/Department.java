package mediator.depts;

import mediator.Mediator;

public abstract class Department {
	protected Mediator med;
	public Department(Mediator med) {
		this.med = med;
	}
	//自己做
	public abstract void selfAction();
	//别人做
	public abstract void outAction();
}
