package context;

import states.PaidState;
import states.SeekingGoodState;
import states.State;
import states.WaitingPayState;

public class Target {
	private String goodsName;
	
	private State currentState;

	private SeekingGoodState seekingGoodState;

	private PaidState paidState;

	private WaitingPayState waitingPayState;

	public Target() {
		seekingGoodState = new SeekingGoodState(this);
		paidState = new PaidState(this);
		waitingPayState = new WaitingPayState(this);
		this.setState(this.getSeekingGoodState());
	}


	public void takeOrder(String goods) {
		goodsName = goods;
		currentState.takeOrder(goodsName);
	}

	public void pay() {
		currentState.pay(goodsName);
	}

	public void get() {
		currentState.get(goodsName);
	}

	public void cancelOrder() {
		currentState.cancelOrder(goodsName);
	}
	
	public void setState(State state) {
		this.currentState = state;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public SeekingGoodState getSeekingGoodState() {
		return seekingGoodState;
	}

	public void setSeekingGoodState(SeekingGoodState seekingGoodState) {
		this.seekingGoodState = seekingGoodState;
	}

	public PaidState getPaidState() {
		return paidState;
	}

	public void setPaidState(PaidState paidState) {
		this.paidState = paidState;
	}

	public WaitingPayState getWaitingPayState() {
		return waitingPayState;
	}

	public void setWaitingPayState(WaitingPayState waitingPayState) {
		this.waitingPayState = waitingPayState;
	}

}
