package strategy.model;

import strategy.action.Bark;
import strategy.action.Move;

public class HuskyDog extends Dog {

	public HuskyDog(Bark bark, Move move) {
		super();
		this.bark = bark;
		this.move = move;
	}
	
	public void beLovely() {
		System.out.println("Kiss ... ");
	}
}
