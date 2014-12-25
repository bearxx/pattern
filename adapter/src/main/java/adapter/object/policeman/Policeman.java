package adapter.object.policeman;

public class Policeman implements Police {
	private String name;
	private int id;

	public Policeman(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "{" + name + " : " + id + "}";
	}
	
	@Override
	public void bePoliceman() {
		System.out.println("I AM A POLICEMAN !");
	}
}
