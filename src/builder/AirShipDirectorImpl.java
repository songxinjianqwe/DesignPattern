package builder;

import builder.beans.AirShip;
import builder.beans.Engine;
import builder.beans.EscapeTower;
import builder.beans.OrbitalModule;

public class AirShipDirectorImpl implements AirShipDirector {
	private AirShipBuilder builder;

	public AirShipDirectorImpl(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip createAipShip() {
		OrbitalModule orbitalModule = builder.createOrbitalModule();
		Engine engine = builder.createEngine();
		EscapeTower escapeTower = builder.createEscapeTower();
		System.out.println("组装神舟飞船中.....");
		return new AirShip(orbitalModule, engine, escapeTower);
	}

}
