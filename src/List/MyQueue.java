package List;

import java.util.LinkedList;

public class MyQueue implements Queue {
	
	LinkedList<Hero> list = new LinkedList<Hero>();

	public void push(Hero h) {
		list.addLast(h);
	}
	
	public Hero pull() {
		return list.removeFirst();
	}
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		//
		for (int i = 0; i < 5; i++) {
			queue.push(new Hero("Lion" + i));
		}
		System.out.println(queue.list);
		
		for (int i = 0; i < 5; i++) {
			queue.pull();
			System.out.println(queue.list);
		}
	}
}
