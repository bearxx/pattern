package command.invoker;

import command.command.Command;

public class Invoker {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();
	}
	
}
