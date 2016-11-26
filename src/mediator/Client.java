package mediator;

import mediator.depts.Development;
import mediator.depts.Market;

public class Client {
	public static void main(String[] args) {
		Mediator med = new President();
		Market market = new Market(med);
		Development deve = new Development(med);
		
		market.selfAction();
		market.outAction();
	}

}
