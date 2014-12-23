package factory.computer.abs.domain;

import factory.computer.abs.product.Keyboard;
import factory.computer.abs.product.Mouse;

public abstract class Peripheral {
	private Mouse mouse;
	private Keyboard Keyboard;

	public void compositePeripheral(Mouse mouse, Keyboard Keyboard) {
		this.mouse = mouse;
		this.Keyboard = Keyboard;
	}
	
	public String toString() {
		return mouse.toString() + "-- " + Keyboard.toString();
	}

}
