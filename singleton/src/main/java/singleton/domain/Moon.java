package singleton.domain;

/***
 * Singleton of moon
 * 
 * @author lmx
 *
 */
public class Moon {
	private volatile static Moon moon;

	private Moon() {
	}

	public static Moon getInstance() {
		if (moon == null) {
			synchronized(Moon.class) {
				if(moon == null) {
					moon = new Moon();
				}
			}
		}
		return moon;
	}
	
	public String toString() {
		return "Shining moon is my wife";
	}

}
