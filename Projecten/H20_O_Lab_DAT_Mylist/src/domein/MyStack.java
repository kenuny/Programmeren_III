package domein;

import java.io.Serializable;

import domein.MyList;

public class MyStack<T extends Serializable> implements Serializable {
	private MyListIterable<T> list;

	public MyStack() {
		this("Stack");
	}

	public MyStack(String name) {
		list = new MyListIterable<>(name);
	}

	public void push(T data) {
		list.insertAtFront(data);
	}

	public T pop() {
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





































/*
// package domein;

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

*/


