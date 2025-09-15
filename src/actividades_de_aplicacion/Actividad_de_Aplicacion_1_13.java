package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_13 {

	public static void main(String[] args) {

		// Modifica la Actividad de Aplicación 1.12 para que, indicando dos números n y
		// m, diga que cántidad hay que sumarle a n para que sea múltiplo de m.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número n");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce un número m");
		int m = Integer.parseInt(sc.nextLine());

		int sum = -(n % m - m);

		System.out.println("A " + n + " hay que sumarle " + sum + " para que sea múltiplo de " + m);

		sc.close();

	}

}
