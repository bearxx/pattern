package factory.computer.abs.product;

public abstract class Mouse {
	private String name;

	public Mouse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "MOUSE:[ " + name + " ]"; 
	}
}
