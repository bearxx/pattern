package adapter.object.adaptee;

public class Theaf {
	private String name;
	
	public Theaf(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{" + name + " : 0000}";
	}
	
	public void pretendAsPoliceman() {
		System.out.println("i am a policeman .");
	}

}
