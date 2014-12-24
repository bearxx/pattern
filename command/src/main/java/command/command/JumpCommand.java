package command.command;

import command.receiver.Soldier;

public class JumpCommand implements Command {
	public Soldier soldier;

	public JumpCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void execute() {
		soldier.jump();
	}

}
