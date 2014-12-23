package factory.computer.abs.domain;

import factory.computer.abs.factory.ComponentFactory;
import factory.computer.abs.factory.LapooComponentFactory;

public class Lapoo extends Peripheral {
	private ComponentFactory componentFactory = new LapooComponentFactory();

	public Lapoo() {
		compositePeripheral(componentFactory.provideMouse(), componentFactory.provideKeyboard());
	}

}
