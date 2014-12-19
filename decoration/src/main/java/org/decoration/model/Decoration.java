package org.decoration.model;

public abstract class Decoration extends Food {
	
	@Override
	public abstract String getDescription();

	@Override
	public abstract int cost();

}
