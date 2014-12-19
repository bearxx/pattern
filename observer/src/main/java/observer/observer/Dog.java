package observer.observer;

import observer.subject.Subject;

public class Dog implements Observer {
	
	Subject muster;
	
	public Dog(Subject muster) {
		this.muster = muster;
		muster.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("wangwangwang ... ");
	}

}
