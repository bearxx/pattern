package factory.computer.product;

public class ThinkpadComputer  extends Computer {

	public ThinkpadComputer(String name) {
		super(name);
	}

	@Override
	public void box() {
		System.out.println(super.getName() + " is boxing");
	}

}