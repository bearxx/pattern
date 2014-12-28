package main;

import context.Target;

public class MainRun {

	public static void main(String[] args) {
		Target buyer = new Target();
		buyer.cancelOrder();
		buyer.takeOrder("girl friend");
		buyer.cancelOrder();
		buyer.takeOrder("wife");
		buyer.get();
		buyer.pay();
		buyer.get();
	}

}
