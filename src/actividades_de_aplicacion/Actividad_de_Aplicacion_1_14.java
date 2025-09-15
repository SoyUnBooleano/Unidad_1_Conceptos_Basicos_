package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_14 {

	public static void main(String[] args) {
		
		// Crea un programa que pida la base y la altura de un triángulo y muestre su área.
		
		double base, altura, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		base = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la altura");
		altura = Double.parseDouble(sc.nextLine());
		
		area = base*altura/2;
		
		System.out.printf("El área del triángulo introducido es de €.2f",area);
		
		sc.close();

	}

}
