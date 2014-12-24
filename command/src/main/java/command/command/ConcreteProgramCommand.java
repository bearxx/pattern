package command.command;

import command.receiver.StrategyReceiver;

public class ConcreteProgramCommand implements ProgramCommand {
	
	private StrategyReceiver reveiver;

	@Override
	public void setProgramCommand(StrategyReceiver reveiver) {
		this.reveiver = reveiver;
	}

	@Override
	public void execute() {
		reveiver.execute();
	}

	@Override
	public void undo() {
		reveiver.undo();		
	}

}
