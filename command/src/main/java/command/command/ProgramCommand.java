package command.command;

import command.receiver.StrategyReceiver;

public interface ProgramCommand {
	public void setReciever(StrategyReceiver reveiver);

	public void execute();

	public void undo();
}
