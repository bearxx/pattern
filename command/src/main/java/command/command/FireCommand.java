package command.command;

import command.receiver.Soldier;


public class FireCommand implements Command {

	public Soldier soldier;

	public FireCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void execute() {
		soldier.fire();
	}

}
