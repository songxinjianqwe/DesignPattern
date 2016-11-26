package mediator.depts;

import mediator.Mediator;

public class Development extends Department {
	public Development(Mediator med) {
		super(med);
		med.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("研发产品");
	}

	@Override
	public void outAction() {
		System.out.println("研发部向总经理提出请求");

	}

}
