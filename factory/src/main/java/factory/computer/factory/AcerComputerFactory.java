package factory.computer.factory;

import factory.computer.product.AcerComputer;
import factory.computer.product.Computer;

public class AcerComputerFactory extends ComputerFactory {
	private static Integer id = new Integer(0);

	public AcerComputerFactory() {
		super("Acer factory");
	}

	@Override
	public Computer produceNaked() {
		synchronized(id) {
			return new AcerComputer("Acer:id-" + (++id));			
		}
	}

}
