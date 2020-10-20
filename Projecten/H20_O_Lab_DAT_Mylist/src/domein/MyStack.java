package domein;

import domein.MyList;

public class MyStack {
	private MyList list;

	public MyStack() {
		this("Stack");
	}

	public MyStack(String name) {
		list = new MyList(name);
	}

	public void push(String data) {
		list.insertAtFront(data);
	}

	public String pop() {
		return list.removeFromFront();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
