public class Node {
	private int dummy;
	private Node next;

	public Node(int dummy, Node next) {
		this.dummy = dummy;
		this.next = next;
	}

	public int getDummy() {
		return this.dummy;
	}

	public void setDummy(int dummy) {
		this.dummy = dummy;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}