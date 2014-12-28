package composite;

import java.util.Iterator;

/**
 * a tree structure, whole/part architecture
 * 
 * @author MiXian
 *
 */
public abstract class Node {
	protected String description;

	public void addNode(Node node) {
		throw new UnsupportedOperationException();
	}

	public void removeNode(Node node) {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator<Node> createIterator();

	public abstract void action();
}
