/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import exceptions.EmptyListException;

import java.io.Serializable;
import java.util.Iterator;

public class MyListIterable<T extends Serializable> implements Iterable<T>, Serializable {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private String nameList;

	public MyListIterable() {
		this("List");
	}

	public MyListIterable(String name) {
		nameList = name;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return nameList + " is empty";
		}

		StringBuilder buffer = new StringBuilder();
		buffer.append("The ").append(nameList).append(" is: ");
		Node<T> current = firstNode;
		while (current != null) {
			buffer.append(current.getData()).append("    ");
			current = current.getNext();
		} // end while

		return buffer.toString();
	} // end method toString

	public void insertAtFront(T data) {
		Node<T> aNode = new Node<>(data);
		if (isEmpty()) {
			firstNode = lastNode = aNode;
		} else {
			aNode.setNext(firstNode);
			firstNode = aNode;
		}
	}

	public void insertAtBack(T data) {
		Node<T> aNode = new Node<>(data);
		if (isEmpty()) {
			firstNode = lastNode = aNode;
		} else {
			lastNode.setNext(aNode);
			lastNode = aNode;
		}
	}

	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) {
			throw new EmptyListException(nameList);
		}

		T removedItem = firstNode.getData();
		if (firstNode == lastNode) {
			firstNode = lastNode = null;
		} else {
			firstNode = firstNode.getNext();
		}

		return removedItem;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}

	private class MyIterator<T extends Serializable> implements Iterator<T> {

		private Node<T> current = (Node<T>) MyListIterable.this.firstNode;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T data = current.getData();
			current = current.getNext();
			return data;
		}

	}

}






































// Oorspronkelijke klasse
// /*
//* To change this license header, choose License Headers in Project Properties.
//* To change this template file, choose Tools | Templates
//* and open the template in the editor.
//*/
//package domein;
//
//import exceptions.EmptyListException;
//import java.util.Iterator;
//
//public class MyListIterable implements Iterable<String> {
//	private Node firstNode;
//	private Node lastNode;
//	private String nameList;
//
//	public MyListIterable() {
//		this("List");
//	}
//
//	public MyListIterable(String name) {
//		nameList = name;
//	}
//
//	public boolean isEmpty() {
//		return firstNode == null;
//	}
//
//	@Override
//	public String toString() {
//		if (isEmpty()) {
//			return nameList + " is empty";
//		}
//
//		StringBuilder buffer = new StringBuilder();
//		buffer.append("The ").append(nameList).append(" is: ");
//		Node current = firstNode;
//		while (current != null) {
//			buffer.append(current.getData()).append("    ");
//			current = current.getNext();
//		} // end while
//
//		return buffer.toString();
//	} // end method toString
//
//	public void insertAtFront(String data) {
//		Node aNode = new Node(data);
//		if (isEmpty()) {
//			firstNode = lastNode = aNode;
//		} else {
//			aNode.setNext(firstNode);
//			firstNode = aNode;
//		}
//	}
//
//	public void insertAtBack(String data) {
//		Node aNode = new Node(data);
//		if (isEmpty()) {
//			firstNode = lastNode = aNode;
//		} else {
//			lastNode.setNext(aNode);
//			lastNode = aNode;
//		}
//	}
//
//	public String removeFromFront() throws EmptyListException {
//		if (isEmpty()) {
//			throw new EmptyListException(nameList);
//		}
//
//		String removedItem = firstNode.getData();
//		if (firstNode == lastNode) {
//			firstNode = lastNode = null;
//		} else {
//			firstNode = firstNode.getNext();
//		}
//
//		return removedItem;
//	}
//
//	@Override
//	public Iterator<String> iterator() {
//		return new MyIterator();
//	}
//
//	private class MyIterator implements Iterator<String> {
//
//		private Node current = MyListIterable.this.firstNode;
//
//		@Override
//		public boolean hasNext() {
//			return current != null;
//		}
//
//		@Override
//		public String next() {
//			String data = current.getData();
//			current = current.getNext();
//			return data;
//		}
//
//	}
//
//}

//
