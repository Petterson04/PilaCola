import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cola cola = new Cola();
		int dummy, option = 0;

		do {
			System.out.println("\nMENU:");
			System.out.println("1. Push (meter).");
			System.out.println("2. Pop (sacar).");
			System.out.println("3. Mostrar los elementos de la cola.");
			System.out.println("0. Salir.");
			System.out.print("Escoge una opción: ");
			option = in.nextInt();
			switch (option) {
				case 1:
					System.out.print("\nIngresa el dato: ");
					dummy = in.nextInt();
					cola.push(dummy);
					break;
				case 2:
					cola.pop();
					break;
				case 3:
					cola.showData();
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