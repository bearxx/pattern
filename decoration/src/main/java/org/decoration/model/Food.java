package org.decoration.model;

public abstract class Food {
	private String description = "Food";

	public Food() {
	}
	
	public abstract int cost();

	public String getDescription() {
		return description;
	}

}
