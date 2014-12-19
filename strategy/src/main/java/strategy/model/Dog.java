package strategy.model;

import strategy.action.Bark;
import strategy.action.Move;

public abstract class Dog implements Bark, Move{
	protected Bark bark;
	protected Move move;
	
	public void move() {
		move.move();
	}
	
	public void bark() {
		bark.bark();
	}

	public void setBark(Bark bark) {
		this.bark = bark;
	}

	public void setMove(Move move) {
		this.move = move;
	}
	
}
