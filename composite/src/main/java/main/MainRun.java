package main;

import java.util.Iterator;

import composite.Menu;
import composite.MenuItem;
import composite.Node;

public class MainRun {

	public static void main(String[] args) {
		Node main = new Menu("Main");
		
		Node foodMenu = new Menu("Food");
		Node entertainMenu = new Menu("ENtertainment");
		Node computerMenu = new Menu("computer games");
		
		main.addNode(computerMenu);
		main.addNode(entertainMenu);
		main.addNode(foodMenu);
		
		foodMenu.addNode(new MenuItem("banana"));
		foodMenu.addNode(new MenuItem("apple"));
		foodMenu.addNode(new MenuItem("noddle"));
		entertainMenu.addNode(new MenuItem("football"));
		entertainMenu.addNode(computerMenu);
		computerMenu.addNode(new MenuItem("cs"));
		computerMenu.addNode(new MenuItem("cod"));
		computerMenu.addNode(new MenuItem("milatery"));
		// ------------------
		
		main.action();
		
		System.out.println("===============");
		
		Iterator<Node> iterator = main.createIterator();
		while(iterator.hasNext()) {
			Node node = iterator.next();
			node.action();
		}
	}

}
