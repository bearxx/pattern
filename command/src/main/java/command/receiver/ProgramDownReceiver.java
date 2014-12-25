package command.receiver;

public class ProgramDownReceiver implements StrategyReceiver {

	@Override
	public void execute() {
		System.out.println("previous program");
	}

	@Override
	public void undo() {
		System.out.println("next program");
	}

}
