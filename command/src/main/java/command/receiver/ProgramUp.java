package command.receiver;

public class ProgramUp implements StrategyReceiver {

	@Override
	public void execute() {
		System.out.println("next program");
	}

	@Override
	public void undo() {
		System.out.println("previous program");
	}

}
