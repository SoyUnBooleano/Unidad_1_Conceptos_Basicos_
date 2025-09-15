package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_4 {

	public static void main(String[] args) {

		// Escribir una aplicación que pida el año actual y del nacimiento del usuario.
		// Debe calcular su edad, suponiendo que en el aoñ en curso el usuario ya ha
		// cumplido años.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el año en el que nos encontramos");
		int year = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el año en el que naciste");
		int born = Integer.parseInt(sc.nextLine());

		int age = year - born;

		System.out.println("Tu edad es " + age);

		sc.close();

	}

}
