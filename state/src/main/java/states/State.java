package states;

public interface State {
	public void takeOrder(String goods);

	public void pay(String goods);

	public void get(String goods);

	public void cancelOrder(String goods);
}
