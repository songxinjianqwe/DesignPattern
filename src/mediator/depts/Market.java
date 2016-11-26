package mediator.depts;

import mediator.Mediator;

public class Market extends Department {
	public Market(Mediator med) {
		super(med);
		med.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("开拓市场");
	}

	@Override
	public void outAction() {
		System.out.println("市场部向总经理提出请求");
		med.command("development");
	}

}
