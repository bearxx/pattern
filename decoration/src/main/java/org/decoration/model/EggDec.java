package org.decoration.model;

public class EggDec extends Decoration {
	private Food food;
	
	public EggDec(Food food) {
		this.food = food;
	}

	@Override
	public int cost() {
		return 2 + food.cost();
	}

	@Override
	public String getDescription() {
		return food.getDescription() + "+egg";
	}

}
