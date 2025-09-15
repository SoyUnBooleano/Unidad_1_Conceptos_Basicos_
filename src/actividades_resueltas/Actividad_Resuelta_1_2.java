package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_2 {

	public static void main(String[] args) {

		// Diseñar un programa que pida un número al usuario -- por teclado -- y a
		// continuación lo muestre.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int numero = Integer.parseInt(sc.nextLine());

		System.out.println("Tu número es: " + numero);

		sc.close();

	}

}
