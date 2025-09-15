package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_11 {

	public static void main(String[] args) {

		// Un economista te ha encargado un programa para realizar cálculos con el IVA.
		// La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
		// Muestra en pantalla el importe correspondiente al IVA y al total.

		double base, IVA, importeIVA, total;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base imponible de un producto");
		base = Double.parseDouble(sc.nextLine());

		System.out.println("Introduce el porcentaje de IVA que le quieres aplicar");
		IVA = Double.parseDouble(sc.nextLine());

		IVA *= 0.01;
		importeIVA = base * IVA;
		total = base + importeIVA;

		System.out.printf("El importe correspondiente al IVA es de %.2f €%n", importeIVA);
		System.out.printf("El total del producto es %.2f €%n", total);

		sc.close();

	}

}
