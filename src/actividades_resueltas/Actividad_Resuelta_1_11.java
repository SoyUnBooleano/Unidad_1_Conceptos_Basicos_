package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_11 {

	public static void main(String[] args) {

		// Un frutero necesita calcular los beneficios anuales que obtiene de la venta
		// de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
		// solicite las ventas (en kilos) de cada semestre para cada fruta. La
		// aplicación mostrará el importe total sabiendo que el precio del kilo de
		// manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.

		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERA = 1.95;

		double manzanas1, manzanas2, peras1, peras2, manzanaTotal, peraTotal;
		int kilo;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos kilos de manzanas vendiste durante el primer semestre?");
		kilo = Integer.parseInt(sc.nextLine());
		manzanas1 = kilo * PRECIO_MANZANA;

		System.out.println("¿Cuántos kilos de peras vendiste durante el primer semestre?");
		kilo = Integer.parseInt(sc.nextLine());
		peras1 = kilo * PRECIO_PERA;

		System.out.println("¿Cuántos kilos de manzanas vendiste durante el segundo semestre?");
		kilo = Integer.parseInt(sc.nextLine());
		manzanas2 = kilo * PRECIO_MANZANA;

		System.out.println("¿Cuántos kilos de peras vendiste durante el segundo semestre?");
		kilo = Integer.parseInt(sc.nextLine());
		peras2 = kilo * PRECIO_PERA;

		manzanaTotal = manzanas1 + manzanas2;
		peraTotal = peras1 + peras2;

		System.out.println("El total de beneficios en manzanas ha sido de " + manzanaTotal
				+ " y el de peras ha sido de " + peraTotal);

		sc.close();

	}

}
