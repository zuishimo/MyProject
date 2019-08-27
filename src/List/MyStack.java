package List;

import java.util.LinkedList;

public class MyStack implements Stack {

	LinkedList<Hero> list = new LinkedList<Hero>();
	
	public void push(Hero h) {
	
		list.addLast(h);
	}
	
	public Hero pull() {
		return list.removeLast();
		
	}
	
	public Hero peek() {
		return list.getLast();
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		for (int i = 0; i < 5; i++) {
			stack.push(new Hero("×íÊ±Ä§" + i));
		}
		System.out.println(stack.list);
		for (int i = 0; i < 5; i++) {
			stack.pull();
			System.out.println(stack.list);
		}
		
	}
}
