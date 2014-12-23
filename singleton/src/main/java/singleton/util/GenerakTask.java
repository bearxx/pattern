package singleton.util;

import java.util.concurrent.Callable;

public abstract class GenerakTask<V> implements Callable<V> {

	@Override
	public V call() throws Exception {
		return task();
	}

	/**
	 * 
	 * @return
	 */
	protected abstract V task();
}
