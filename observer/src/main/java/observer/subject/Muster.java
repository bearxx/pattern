package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;


public class Muster implements Subject {
	List<Observer> dogs;
	
	public Muster() {
		dogs = new ArrayList<Observer>();
	};

	@Override
	public void addObserver(Observer observer) {
		dogs.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		dogs.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : dogs) {
			o.update();
		}
	}
	
	public void commond() {
		notifyObserver();
	}

}
