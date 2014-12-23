package factory.computer.factory;

import factory.computer.product.AcerComputer;
import factory.computer.product.Computer;

public class ThinkpadComputerFactory extends ComputerFactory {
	private static Integer id = new Integer(0);

	public ThinkpadComputerFactory() {
		super("Thinkpad factory");
	}

	@Override
	public Computer produceNaked() {
		synchronized (id) {
			return new AcerComputer("Thinkpad:id-" + (++id));
		}
	}

}
