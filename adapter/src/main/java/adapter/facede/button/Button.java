package adapter.facede.button;

import java.util.ArrayList;
import java.util.List;

import adapter.facede.model.Device;

/***
 * Button work as a facade pattern. In addition, the domain <tt>devices</tt> 
 * just work like the observer pattern. The methods <tt>on</tt>,<tt>off</tt>
 * and <tt>run</tt> invoked work like strategy pattern.
 * 
 * @author lmx
 *
 */
public class Button {
	
	private enum Status {
		ON,OFF
	}
	
	Status status;
	
	List<Device> devices;
	
	public Button() {
		devices = new ArrayList<Device>();
		this.status = Status.OFF;
	}
	
	public void addDevice(Device device) {
		devices.add(device);
	}
	
	public void remove(Device device) {
		devices.remove(device);
	}
	
	public void removeAll() {
		devices.clear();
		devices.size();
	}
	
	public void on() {
		for(Device device : devices) {
			device.on();
		}
		this.status = Status.ON;
		System.out.println("All devices is on");
	}
	
	public void off() {
		for(Device device : devices) {
			device.off();
		}
		this.status = Status.OFF;
		System.out.println("All devices is off");	
	}
	
	public void run() {
		if(status.equals(Status.OFF)) {
			System.out.println("Error. Devices not on, please turn on.");
			return;
		}
		for(Device device : devices) {
			device.run();
		}
		System.out.println("All devices is running");
	}
}
