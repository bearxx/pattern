package template.process;

/**
 * imitate hunting girl friend
 * @author lmx
 *
 */
public abstract class HuntProcess {
	public final void produce() {
		findTarget();
		makeFriends();
		propose();
		if (isAccepted()) {
			ceremony();
		} else {
			moveOn();
		}
	}

	/**
	 * act as hook
	 * @return
	 */
	protected boolean isAccepted() {
		return false;
	}

	private final void moveOn() {
		System.out.println("Waiting ....");
	}

	private final void ceremony() {
		System.out.println("Happy wedding");
	}

	protected abstract void propose();

	protected abstract void makeFriends() ;

	private final void findTarget() {
		System.out.println("I found you when wandering in school!");
	}
}
