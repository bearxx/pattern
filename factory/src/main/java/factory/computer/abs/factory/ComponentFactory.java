package factory.computer.abs.factory;

import factory.computer.abs.product.Keyboard;
import factory.computer.abs.product.Mouse;

/**
 * </b>Abstract factory example</b></br>
 * Create some classes of Object. There are two classes to be provided.
 * @author lmx
 *
 */
public interface ComponentFactory {
	public Mouse provideMouse();

	public Keyboard provideKeyboard();
}
