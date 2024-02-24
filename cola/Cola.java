public class Cola {
	private Node back;
	private Node front;

	public Cola() {
		this.back = null;
		this.front = null;
	}

	public boolean isColaEmpty(boolean showWarning) {
		if (back == null) {
			if (showWarning)
				System.out.println("\nADVERTENCIA: La lista se encuentra vacía.");
			return true;
		}
		return false;
	}

	public void push(int dummy) {
		Node node = new Node(dummy, null);
		if (isColaEmpty(false)) {
			back = node;
			front = node;
		} else {
			node.setNext(back);
			back = node;
		}
		System.out.println("El elemento inicial se ha insertado con éxito.");
	}

	public void pop() {
		Node aux = back;
		if (!isColaEmpty(true)) {
			if (getAmountNodes() >= 2) {
				aux = back;
				while (aux.getNext() != front)
					aux = aux.getNext();
				aux.setNext(null);
				front = aux;
			} else {
				back = null;
				front = null;
			}
			System.out.println("El elemento final se ha eliminado con éxito.");
		}
	}

	public int getAmountNodes() {
		Node aux;
		int counter = 0;
		if (!isColaEmpty(false)) {
			aux = back;
			while (aux != null) {
				++counter;
				aux = aux.getNext();
			}
		}
		return counter;
	}

	public void showData() {
		Node aux = back;
		int counter = 0;
		if (!isColaEmpty(true))
			while (aux != null) {
				counter++;
				System.out.printf("\n%d° elemento de la lista...", counter);
				System.out.println("\n\tDato: " + aux.getDummy());
				aux = aux.getNext();
			}
	}

}