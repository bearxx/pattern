package composite;

import java.util.Iterator;
import java.util.Stack;

public class NodeIterator implements Iterator<Node> {
	Stack<Iterator<Node>> stack = new Stack<Iterator<Node>>();

	public NodeIterator(Iterator<Node> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (!stack.isEmpty()) {
			Iterator<Node> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public Node next() {
		if(hasNext()) {
			Iterator<Node> iterator = stack.peek();
			Node node = iterator.next();
			if(node instanceof Menu) {
				stack.push(node.createIterator());
			}
			return node;
		}
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
