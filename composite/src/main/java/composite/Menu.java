package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends Node {
	List<Node> children;

	public Menu(String description) {
		this.description = description;
		children = new ArrayList<Node>();
	}

	@Override
	public void addNode(Node node) {
		children.add(node);
	}
	
	@Override
	public void removeNode(Node node) {
		children.remove(node);
	}

	@Override
	public Iterator<Node> createIterator() {
		return this.children.iterator();
	}

	@Override
	public void action() {
		System.out.println("Menu > " + this.description);
		for(Node node : children) {
			node.action();
		}
	}

}
