package factory.main;

import factory.computer.abs.domain.Lapoo;
import factory.computer.abs.domain.Peripheral;
import factory.computer.abs.domain.Thinkpad;
import factory.computer.factory.AcerComputerFactory;
import factory.computer.factory.ComputerFactory;
import factory.computer.factory.ThinkpadComputerFactory;
import factory.computer.product.Computer;

public class MainRun {
	public static void main(String[] args) {
		// ---------------  factory method -----------------
		/*
		 * Factory method produces one product and always the type of 
		 * product is determined by the concrete subclass of the
		 * factory superclass, which is generally defined as 'interface'.
		 */
		ComputerFactory acerFac = new AcerComputerFactory();
		for(int i=0;i<10;i++) {
			Computer compt = acerFac.produce();
			System.out.println(compt.getName());
		}
		
		ComputerFactory thinkpadFac = new ThinkpadComputerFactory();
		for(int i=0;i<10;i++) {
			Computer compt = thinkpadFac.produce();
			System.out.println(compt.getName());
		}
		
		// ---------------  abstract factory -----------------
		/*
		 * Abstract factory produces a family of products that are 
		 * components(fields) of a class and always it uses the
		 * factory method to implement it.
		 */
		Peripheral lapoo = new Lapoo();
		for(int i=0;i<10;i++) {
			System.out.println(lapoo);
		}
		
		Peripheral thinkpad = new Thinkpad();
		for(int i=0;i<10;i++) {
			System.out.println(thinkpad);
		}
	}

}
