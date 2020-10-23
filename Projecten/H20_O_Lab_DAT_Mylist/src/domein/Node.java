package domein;

import java.io.Serializable;

public class Node<T extends Serializable> implements Serializable{

	private final T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public final void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}
}
















// Oorspronkelijke klasse.
//package domein;
//
//public class Node {
//
//	private final String data;
//	private Node next;
//
//	public Node(String data) {
//		this.data = data;
//	}
//
//	public String getData() {
//		return data;
//	}
//
//	public final void setNext(Node next) {
//		this.next = next;
//	}
//
//	public Node getNext() {
//		return next;
//	}
//}
