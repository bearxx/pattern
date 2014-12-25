package command.invoker;

import command.command.ProgramCommand;

public class ProgramInvoker {
	
	ProgramCommand command;

	public void setCommand(ProgramCommand command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();
	}
	
	public void undo() {
		command.undo();
	}

}
