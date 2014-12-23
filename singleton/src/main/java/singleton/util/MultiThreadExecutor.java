package singleton.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class MultiThreadExecutor {
	private static BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(20);
	private static ExecutorService executor = new ThreadPoolExecutor(10, 20, 1L, TimeUnit.SECONDS, workQueue);
	
	public static <V> List<V> executeTask(List<GenerakTask<V>> tasks) {
		List<Future<V>> futures = new ArrayList<Future<V>>();
		for(GenerakTask<V> task : tasks) {
			futures.add(executor.submit(task));
		}
		List<V> result = new ArrayList<V>();
		for(Future<V> future : futures) {
			try {
				result.add(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
