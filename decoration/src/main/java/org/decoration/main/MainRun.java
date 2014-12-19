package org.decoration.main;

import org.decoration.model.EggDec;
import org.decoration.model.Food;
import org.decoration.model.Noodle;
import org.decoration.model.SausageDec;

public class MainRun {

	public static void main(String[] args) {
		Food food = new Noodle();
		food = new EggDec(food);
		food = new SausageDec(food);
		food = new EggDec(food);
		System.out.println("desc: " + food.getDescription());
		System.out.println("cost: " + food.cost());
	}

}
