package factory.computer.product;

public class AcerComputer extends Computer {

	public AcerComputer(String name) {
		super(name);
	}

	@Override
	public void box() {
		System.out.println(super.getName() + " is boxing");
	}

}
