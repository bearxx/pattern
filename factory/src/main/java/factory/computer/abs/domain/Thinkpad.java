package factory.computer.abs.domain;

import factory.computer.abs.factory.ComponentFactory;
import factory.computer.abs.factory.LogistComponentFactory;

public class Thinkpad extends Peripheral {
	private ComponentFactory componentFactory = new LogistComponentFactory();

	public Thinkpad() {
		compositePeripheral(componentFactory.provideMouse(), componentFactory.provideKeyboard());
	}

}
