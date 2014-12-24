package command.receiver;

public class ProgramDown implements StrategyReceiver {

	@Override
	public void execute() {
		System.out.println("previous program");
	}

	@Override
	public void undo() {
		System.out.println("next program");
	}

}
