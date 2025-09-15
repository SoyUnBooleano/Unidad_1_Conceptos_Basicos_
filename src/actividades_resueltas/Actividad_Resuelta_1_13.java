package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_13 {

	public static void main(String[] args) {

		// Escribir un programa que solicite las notas del primer segundo y tercer
		// trimestre (notas enteras que se solicitarán al usuario). El programa debe
		// mostrar la nota media del curso como se utiliza en el boletín de
		// calificaciones (solo la parte entera) y como se usa en el expediente
		// académico (con decimales).

		int primerT, segundoT, tercerT, mediaBoletin;
		double mediaExpediente;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la nota del primer trimestre");
		primerT = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la nota del segundo trimestre");
		segundoT = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la nota del tercer trimestre");
		tercerT = Integer.parseInt(sc.nextLine());

		mediaExpediente = (primerT + segundoT + tercerT) / 3.0;
		mediaBoletin = (int) mediaExpediente;

		System.out.printf("Tu nota en el expediente académico es %.2f%n", mediaExpediente);
		System.out.println("Tu nota en el boletín de calificaciones es: " + mediaBoletin);

		sc.close();

	}

}
