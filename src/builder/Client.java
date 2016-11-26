package builder;

import builder.beans.AirShip;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new AirShipDirectorImpl(new AirShipBuilderImpl());
		AirShip airShip = director.createAipShip();
		airShip.launch();
	}

}
