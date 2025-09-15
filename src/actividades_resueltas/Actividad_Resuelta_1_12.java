package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_12 {

	public static void main(String[] args) {

		// Escribir un programa que pida un número al usuario y muestre su valor
		// absoluto.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor y te devolveré el valor absoluto");
		int num = Integer.parseInt(sc.nextLine());
		
		int va = num >= 0 ? num : -num;
		
		System.out.println("El valor absoluto de " + num + " es " + va);
		
		sc.close();

	}

}
