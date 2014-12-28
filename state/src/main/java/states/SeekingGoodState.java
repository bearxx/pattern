package states;

import context.Target;

public class SeekingGoodState implements State {

	private Target buyer;

	public SeekingGoodState(Target buyer) {
		this.buyer = buyer;
	}

	@Override
	public void takeOrder(String goods) {
		System.out.println("taked a order to buy " + goods);
		buyer.setState(buyer.getWaitingPayState());
	}

	@Override
	public void pay(String goods) {
		System.out.println("Nothing to buy, please take order first");
	}

	@Override
	public void get(String goods) {
		System.out.println("Nothing to buy, please take order first");
	}

	@Override
	public void cancelOrder(String goods) {
		System.out.println("No orders, unnecessary");
	}

}
