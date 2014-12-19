package org.decoration.model;

public class SausageDec extends Decoration {
	private Food food;

	public SausageDec(Food food) {
		this.food = food;
	}

	@Override
	public int cost() {
		return 3 + food.cost();
	}

	@Override
	public String getDescription() {
		return food.getDescription() + "+ausage";
	}

}
