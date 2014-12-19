package org.decoration.model;

public class Noodle extends Food {

	@Override
	public int cost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "+Noodle";
	}

}
