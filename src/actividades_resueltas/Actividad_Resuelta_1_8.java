package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_8 {

	public static void main(String[] args) {

		// Realizar una aplicación que solicite al usuario su edad y le indique si es
		// mayor de edad (mediante un literal booleano: true o false)

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad");
		int edad = Integer.parseInt(sc.nextLine());

		System.out.println("¿Eres adulto? " + (edad >= 18));

		sc.close();

	}

}
