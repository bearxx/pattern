package factory.computer.factory;

import factory.computer.product.Computer;

/**
 * factory method
 * 
 * @author lmx
 *
 */
public abstract class ComputerFactory {

	private String name;

	public ComputerFactory(String name) {
		this.name = name;
	}

	/**
	 * need to initial name of the factory
	 * 
	 * @param name
	 * @return
	 */
	public abstract Computer produceNaked();

	public String getName() {
		return name;
	}
	
	public Computer produce() {
		Computer computer = produceNaked();
		computer.box();
		return computer;
	}
}
