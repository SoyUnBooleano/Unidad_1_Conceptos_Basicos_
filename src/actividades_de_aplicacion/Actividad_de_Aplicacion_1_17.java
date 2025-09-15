package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_17 {

	public static void main(String[] args) {

		// Solicita al usuario tres distancias:

		// La primera, medida en milímetros.

		// La segunda, medida en centímetros.

		// La última, medida en metros.

		// Diseña un programa que muestre la suma de las tres longitudes introducidas
		// (medidas en centímetros).

		double mm, cm, m, suma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la medida en milímetros");
		mm = Double.parseDouble(sc.nextLine());

		System.out.println("Introduce la medida en centímetros");
		cm = Double.parseDouble(sc.nextLine());

		System.out.println("Introduce la medida en metros");
		m = Double.parseDouble(sc.nextLine());

		suma = (mm / 10) + (m * 100) + cm;

		System.out.printf("La suma de las tres longitudes es %.2f centímetros %n", suma);

		sc.close();
	}

}
