package strategy.model;

import strategy.action.Bark;
import strategy.action.Move;

public class ShepHerdDog extends Dog{
	
	public ShepHerdDog(Bark bark, Move move) {
		super();
		this.bark = bark;
		this.move = move;
	}
	
	public void guid() {
		System.out.println("guiding ... ");
	}
}
