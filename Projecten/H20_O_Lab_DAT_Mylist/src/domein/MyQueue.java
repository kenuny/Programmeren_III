package domein;

public class MyQueue {

	private MyList list;

	public MyQueue() {
		this("Queue");
	}

	public MyQueue(String naam) {
		list = new MyList(naam);
	}

	public void offer(String data) {
		list.insertAtBack(data);
	}

	public String poll() {
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
