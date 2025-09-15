package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_16 {

	public static void main(String[] args) {

		// Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		// segundos. La aplicación debe mostrar cuantas horas, minutos y segundos hay en
		// el número de de segundos introducidos por el usuario.

		int num, minuto, hora, segundo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de segundos");
		num = Integer.parseInt(sc.nextLine());

		hora = num / 3600;
		minuto = num % 3600 / 60;
		segundo = num % 3600 % 60;

		System.out.println(
				"En " + num + " segundos hay " + hora + " horas, " + minuto + " minutos y " + segundo + " segundos.");

		sc.close();

	}

}
