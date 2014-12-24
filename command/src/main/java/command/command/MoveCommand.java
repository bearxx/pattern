package command.command;

import command.receiver.Soldier;

public class MoveCommand implements Command {
	public Soldier soldier;

	public MoveCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void execute() {
		soldier.move();
	}

}
