package composite;

import java.util.Iterator;

public class MenuItem extends Node {

	public MenuItem(String description) {
		this.description = description;
	}
	
	@Override
	public Iterator<Node> createIterator() {
		return new NullIterator();
	}

	@Override
	public void action() {
		System.out.println("MenuItem --> " + this.description);
	}
	
	private class NullIterator implements Iterator<Node>{

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Node next() {
			return null;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();			
		}
		
	}

}
