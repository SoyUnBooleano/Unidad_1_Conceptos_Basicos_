package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicación_1_21 {

	public static void main(String[] args) {

		// Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números
		// son iguales y false en caso contrario.

		int a, b;
		boolean iguales;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número a");
		a = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el número b");
		b = Integer.parseInt(sc.nextLine());

		iguales = a == b;

		System.out.println("¿ " + a + " y " + b + " son iguales ? " + iguales);

		sc.close();

	}

}
