package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_12 {

	public static void main(String[] args) {

		// Escribre un programa que tome como entrada un número entero e indique que
		// cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:

		// A 2 hay que sumarle 5 para que el resultado ( 2 + 5 = 7 ) sea múltiplo de 7.

		// A 13 hay que sumarle 1 para que el resultado ( 13 + 1 = 14 ) sea múltiplo de
		// 7.

		// Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o
		// 1, respectivamente.

		// Pista: el operador módulo puede ser muy útil para solucionar esta actividad.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		int sum = -(num % 7 - 7);

		System.out.println("Para que " + num + " sea múltiplo de 7, hay que sumarle " + sum);

		sc.close();

	}

}
