package adapter.facede.model;

public class Televition implements Device {

	@Override
	public void on() {
		System.out.println("TV on");
	}

	@Override
	public void off() {
		System.out.println("TV off");
	}

	@Override
	public void run() {
		System.out.println("TV run");
	}

}
