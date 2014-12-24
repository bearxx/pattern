package singleton.main;

import singleton.util.MultiThreadExecutor;
import singleton.util.TaskPlay;

public class MainRun {

	public static void main(String[] args) {
		TaskPlay tp1 = new TaskPlay();
		TaskPlay tp2 = new TaskPlay();
		TaskPlay tp3 = new TaskPlay();
		MultiThreadExecutor.executeOneTask(tp1);
		MultiThreadExecutor.executeOneTask(tp2);
		MultiThreadExecutor.executeOneTask(tp3);
		System.out.println(tp1);
		System.out.println(tp2);
		System.out.println(tp3);
//		MultiThreadExecutor.shutdown();
	}

}
