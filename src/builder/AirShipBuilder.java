package builder;

import builder.beans.Engine;
import builder.beans.EscapeTower;
import builder.beans.OrbitalModule;

public interface AirShipBuilder {
	OrbitalModule createOrbitalModule();
	Engine createEngine();
	EscapeTower createEscapeTower();
}
