import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack stack = new Stack();
		int dummy, option = 0;

		do {
			System.out.println("\nMENU:");
			System.out.println("1. Push (Introducir).");
			System.out.println("2. Pop (Eliminar).");
			System.out.println("3. Mostrar los elementos de la pila.");
			System.out.println("0. Salir.");
			System.out.print("Escoge una opción: ");
			option = in.nextInt();
			switch (option) {
				case 1:
					System.out.print("\nIngresa el dato: ");
					dummy = in.nextInt();
					stack.push(dummy);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					stack.showData();
					break;
				case 0:
					System.out.println("\nFin del programa LSL...\n");
					break;
				default:
					System.out.println("\nERROR: Opción no válida...");
			}
		} while (option != 0);

		in.close();
	}
}