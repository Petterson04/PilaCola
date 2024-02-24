public class Stack {
	private Node start;

	public Stack() {
		this.start = null;
	}

	public boolean isStackEmpty(boolean showWarning) {
		if (start == null) {
			if (showWarning)
				System.out.println("\nADVERTENCIA: La lista se encuentra vacía.");
			return true;
		}
		return false;
	}

	public void push(int dummy) {
		Node node = new Node(dummy, null);
		if (isStackEmpty(false))
			start = node;
		else {
			node.setNext(start);
			start = node;
		}
		System.out.println("El elemento inicial se ha insertado con éxito.");
	}

	public void pop() {
		if (!isStackEmpty(true)) {
			start = start.getNext();
			System.out.println("El elemento inicial se ha eliminado con éxito.");
		}
	}

	public void showData() {
		Node aux = start;
		int counter = 0;
		if (!isStackEmpty(true))
			while (aux != null) {
				counter++;
				System.out.printf("\n%d° elemento de la lista...", counter);
				System.out.println("\n\tDato: " + aux.getDummy());
				aux = aux.getNext();
			}
	}

}