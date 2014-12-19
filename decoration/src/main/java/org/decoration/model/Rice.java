package org.decoration.model;

public class Rice extends Food {

	@Override
	public int cost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "+Noodle";
	}
}
