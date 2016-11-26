package builder;

import builder.beans.Engine;
import builder.beans.EscapeTower;
import builder.beans.OrbitalModule;

public class AirShipBuilderImpl implements AirShipBuilder {
	@Override
	public OrbitalModule createOrbitalModule() {
		System.out.println("构建轨道舱中....");
		return new OrbitalModule("New Song");
	}

	@Override
	public Engine createEngine() {
		System.out.println("构建发动机中....");
		return new Engine("New Song");
	}

	@Override
	public EscapeTower createEscapeTower() {
		System.out.println("构建逃逸塔中...");
		return new EscapeTower("New Song");
	}
}
