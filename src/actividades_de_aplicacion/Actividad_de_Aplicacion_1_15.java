package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_15 {

	public static void main(String[] args) {

		// Dado el siguiente polinomio de segundo grado: y = ax² + bx + c

		// Crea un programa que pida los coeficientes a, b y c, así como el valor de x,
		// y calcula el valor correspondiente de y.

		int a, b, c, x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor de a");
		a = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el valor de b");
		b = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el valor de c");
		c = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el valor de x");
		x = Integer.parseInt(sc.nextLine());

		y = a * (x * x) + b * x + c;

		System.out.println("El valor de y es " + y);
		
		sc.close();

	}

}
