package adapter.facede.model;

public class AirCondationning implements Device {

	@Override
	public void on() {
		System.out.println("AirCondationning on");
	}

	@Override
	public void off() {
		System.out.println("AirCondationning off");
	}

	@Override
	public void run() {
		System.out.println("AirCondationning run");
	}

}
