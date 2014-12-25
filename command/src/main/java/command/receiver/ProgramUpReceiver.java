package command.receiver;

public class ProgramUpReceiver implements StrategyReceiver {

	@Override
	public void execute() {
		System.out.println("next program");
	}

	@Override
	public void undo() {
		System.out.println("previous program");
	}

}
