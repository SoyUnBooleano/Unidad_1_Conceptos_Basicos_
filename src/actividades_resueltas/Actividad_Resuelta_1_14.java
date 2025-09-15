package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_14 {

	public static void main(String[] args) {

		// Realizar un programa que pida como entrada un número decimal y lo muestre
		// redondeado al número más próximo.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número decimal");
		double num = Double.parseDouble(sc.nextLine());

		int redondeo = (int) (num + 0.5);

		System.out.println(redondeo);

		sc.close();

	}

}
