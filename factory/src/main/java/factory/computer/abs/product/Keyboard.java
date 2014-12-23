package factory.computer.abs.product;

public abstract class Keyboard {
	private String name;

	public Keyboard(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "KEYBOARD:[ " + name + " ]";
	}
}
