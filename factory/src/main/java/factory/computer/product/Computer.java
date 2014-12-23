package factory.computer.product;

public abstract class Computer {

	private String name;

	public Computer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void box();
}
