package strategy.main;

import strategy.action.CrazyBark;
import strategy.action.CrazyMove;
import strategy.action.QuiteBark;
import strategy.action.QuiteMove;
import strategy.model.Dog;
import strategy.model.HuskyDog;
import strategy.model.ShepHerdDog;

public class MainRun {

	public static void main(String[] args) {
		Dog husky = new HuskyDog(new QuiteBark(), new QuiteMove());
		Dog shepherd = new ShepHerdDog(new CrazyBark(), new CrazyMove());
		husky.bark();
		shepherd.move();
	}

}
