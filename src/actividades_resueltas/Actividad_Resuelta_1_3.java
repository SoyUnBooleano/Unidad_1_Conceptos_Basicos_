package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_3 {

	public static void main(String[] args) {

		// Pedir al usuario su edad y mostrar la que tendrá el próximo año.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad");
		int edad = Integer.parseInt(sc.nextLine());

		System.out.println("El año que viene tendrás " + ++edad);

		sc.close();
	}

}
