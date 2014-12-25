package template.process;

public class PlanProcess extends HuntProcess {

	@Override
	protected void propose() {
		System.out.println("Night, 1 rose, 0 vitiness, 0 candles");
	}

	@Override
	protected void makeFriends() {
		System.out.println("No Rose, No fighting, crying, laughing");
	}

	@Override
	protected boolean isAccepted() {
		return true;
	}

}
