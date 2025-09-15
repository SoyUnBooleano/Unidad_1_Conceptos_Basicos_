package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_7 {

	public static void main(String[] args) {

		// Diseñar una aplicación que calcule la longitud y el área de una
		// circunferencia. Para ello el usuario debe introducir el radio (que puede
		// contener decimales).

		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos a calcular la longitud y el área de una circunferencia");
		System.out.println("Introduce el radio de la circunferencia");
		double radio = Double.parseDouble(sc.nextLine());

		double longitud = Math.PI * 2 * radio;
		double area = Math.PI * Math.pow(radio, 2);

		System.out.printf("La longitud de la circunferencia es  %.2f%n", longitud);
		System.out.printf("El área de la circunferencia es  %.2f%n", area);

		sc.close();

	}

}
