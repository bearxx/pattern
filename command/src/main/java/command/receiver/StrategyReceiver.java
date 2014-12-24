package command.receiver;

/***
 * Receiver with strategy pattern, general use of receiver see soldier.
 * 
 * @author lmx
 *
 */
public interface StrategyReceiver {
	public void execute();

	public void undo();
}
