package com.mti.swplanetapi.common;

import com.mti.swplanetapi.domain.entities.Planet;

public class PlanetConstants {

	public static final Planet PLANET = new Planet("name", "climate", "terrain");
	public static final Planet INVALID_PLANET = new Planet("", "", "");
}
