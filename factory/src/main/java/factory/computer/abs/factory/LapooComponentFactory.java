package factory.computer.abs.factory;

import factory.computer.abs.product.Keyboard;
import factory.computer.abs.product.LapooKeyboard;
import factory.computer.abs.product.LapooMouse;
import factory.computer.abs.product.Mouse;

public class LapooComponentFactory implements ComponentFactory {

	@Override
	public Mouse provideMouse() {
		return new LapooMouse();
	}

	@Override
	public Keyboard provideKeyboard() {
		return new LapooKeyboard();
	}

}
