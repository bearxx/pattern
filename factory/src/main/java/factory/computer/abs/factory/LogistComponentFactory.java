package factory.computer.abs.factory;

import factory.computer.abs.product.Keyboard;
import factory.computer.abs.product.LogistKeyboard;
import factory.computer.abs.product.LogistMouse;
import factory.computer.abs.product.Mouse;

public class LogistComponentFactory implements ComponentFactory {

	@Override
	public Mouse provideMouse() {
		return new LogistMouse();
	}

	@Override
	public Keyboard provideKeyboard() {
		return new LogistKeyboard();
	}

}
