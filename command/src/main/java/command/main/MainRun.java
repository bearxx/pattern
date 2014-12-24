package command.main;

import command.command.Command;
import command.command.FireCommand;
import command.command.JumpCommand;
import command.command.MoveCommand;
import command.command.ConcreteProgramCommand;
import command.invoker.Invoker;
import command.receiver.ProgramUp;
import command.receiver.Soldier;
import command.receiver.StrategyReceiver;

public class MainRun {

	/**
	 * This main function casts as Client
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ****************** general command pattern ******************
		Soldier soldier = new Soldier();

		Invoker fire = new Invoker();
		Invoker jump = new Invoker();
		Invoker move = new Invoker();

		Command fireCommand = new FireCommand(soldier);
		Command jumpCommand = new JumpCommand(soldier);
		Command moveCommand = new MoveCommand(soldier);

		fire.setCommand(fireCommand);
		jump.setCommand(jumpCommand);
		move.setCommand(moveCommand);

		fire.action();
		jump.action();
		move.action();
		move.action();
		move.action();
		jump.action();
		fire.action();
		// ****************** command pattern with strategy pattern ******************
		ProgramInvoker invoker = new Invoker();
		StrategyReceiver upReveiver = new ProgramUp();
		StrategyReceiver downReveiver = new ProgramUp();
		Command command = new ConcreteProgramCommand();
		command.setProgramCommand(upReveiver);
		invoker.setCommand(command);
		
		

	}

}
