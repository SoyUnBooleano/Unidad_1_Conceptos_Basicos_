package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_19 {

	public static void main(String[] args) {

		// Una empresa que gestiona un parque acuático te solicita una aplicación que
		// les ayude a calcular el importe que hay que cobrar en la taquilla por la
		// compra de una serie de entradas (cuyo número será introducido por el
		// usuario). Existen dos tipos de entrada: infantiles, que cuestan 15.50€; y de
		// adultos, que cuestan 20€.

		// En el caso de que el importe total sea igual o superior a 100€, se aplicará
		// automáticamente un bono descuento del 5%.

		final double PRECIO_INFANTIL = 15.50;
		final double PRECIO_ADULTO = 20;
		int numInfantiles, numAdultos;
		double precioTotal, precioFinal;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de entradas infantiles vendidas");
		numInfantiles = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la cantidad de entradas de adulto vendidas");
		numAdultos = Integer.parseInt(sc.nextLine());

		precioTotal = (PRECIO_INFANTIL * numInfantiles) + (PRECIO_ADULTO * numAdultos);
		precioFinal = precioTotal <= 100 ? precioTotal : precioTotal * 0.95;

		System.out.printf("El precio final de todas las entradas es %.2f €", precioFinal);

		sc.close();

	}

}
