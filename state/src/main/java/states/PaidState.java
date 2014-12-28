package states;

import context.Target;

public class PaidState implements State {

	private Target buyer;

	public PaidState(Target buyer) {
		this.buyer = buyer;
	}

	@Override
	public void takeOrder(String goods) {
		System.out.println("Nothing to buy, please waiting for the goods first");
	}

	@Override
	public void pay(String goods) {
		System.out.println("Nothing to buy, please waiting for the goods first");
	}

	@Override
	public void get(String goods) {
		System.out.println("you have got " + goods + "!");
		buyer.setState(buyer.getSeekingGoodState());
	}

	@Override
	public void cancelOrder(String goods) {
		System.out.println("No orders, unnecessary");		
	}

}
