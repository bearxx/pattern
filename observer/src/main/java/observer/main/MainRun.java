package observer.main;

import observer.observer.Dog;
import observer.observer.Observer;
import observer.subject.Muster;

public class MainRun {

	public static void main(String[] args) {
		Muster muster = new Muster();
		
		Observer dog1 = new Dog(muster);
		Observer dog2 = new Dog(muster);
		Observer dog3 = new Dog(muster);
		dog2.update();
		dog3.update();
		System.out.println("--------------");

		muster.commond();
		
		System.out.println("--------------");
		
		muster.removeObserver(dog1);
		
		muster.commond();

	}

}
