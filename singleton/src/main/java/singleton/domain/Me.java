package singleton.domain;

/***
 * Singleton of moon
 * 
 * @author lmx
 */
public class Me {
	private static Me me = new Me();

	private Me() {
	}

	public static Me getInstance() {
		return me;
	}

	@Override
	public String toString() {
		return "paramount LMX";
	}
}
