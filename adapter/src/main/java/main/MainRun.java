package main;

import adapter.facede.button.Button;
import adapter.facede.model.AirCondationning;
import adapter.facede.model.Computer;
import adapter.facede.model.Televition;
import adapter.object.adaptee.Theaf;
import adapter.object.adapter.PolicemanAdapter;
import adapter.object.policeman.Police;
import adapter.object.policeman.Policeman;

public class MainRun {
	public static void main(String[] args) {
		// ************* Adapter *************
		Theaf theaf = new Theaf("Jack");
		Police fakePolice = new PolicemanAdapter(theaf);
		Police realPolice = new Policeman("Denny", 100021);
		
		fakePolice.bePoliceman();		
		realPolice.bePoliceman();
		System.out.println(theaf);
		System.out.println(realPolice);
		
		// ************* Facade *************
		System.out.println("----------------------");
		Button button = new Button();
		button.addDevice(new Televition());
		button.addDevice(new Computer());
		button.addDevice(new Computer());
		button.addDevice(new AirCondationning());
		
		button.on();
		button.off();
		button.run();
		button.on();
		button.run();
		
	}
}
