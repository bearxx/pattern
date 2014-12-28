package states;

import context.Target;

public class WaitingPayState implements State {

	private Target buyer;

	public WaitingPayState(Target buyer) {
		this.buyer = buyer;
	}

	@Override
	public void takeOrder(String goods) {
		System.out.println("Pay or cancel unpaid order first please");
	}

	@Override
	public void pay(String goods) {
		System.out.println("you have paid, please wait for " + goods);
		buyer.setState(buyer.getPaidState());
	}

	@Override
	public void get(String goods) {
		System.out.println("you have not paid, please pay for the goods first");
	}

	@Override
	public void cancelOrder(String goods) {
		System.out.println("you canceled the order to buy " + goods);
		buyer.setState(buyer.getSeekingGoodState());
	}
}
