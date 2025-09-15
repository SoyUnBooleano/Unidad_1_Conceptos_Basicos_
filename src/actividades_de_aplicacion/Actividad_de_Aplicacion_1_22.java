package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_de_Aplicacion_1_22 {

	public static void main(String[] args) {

		// La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
		// competición donde cada participante escribe un algoritmo en un papel y lo
		// lanza, ganando quien consiga lanzarlo más lejos. La pecularidad del concurso
		// es que la longitud del lanzamiento se mide en metro (con tantos decimales
		// como desee), pero para el ranking solo tiene en cuenta la longitud en
		// centímetros (sin deciamles). Por ejemplo, para un lanzamiento de 12,3456 m (
		// que son 1234,56 cm) solo se contabilizarán 1234 cm.

		// Realiza un programa que solicite la longitud (en metros) de un lanzamiento y
		// muestre la parte entera correspondiente en centímetros.

		double m;
		int cm;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Introduce la distancia recorrida por el algoritmo en metros. (Utiliza tantos decimales como desees)");
		m = Double.parseDouble(sc.nextLine());
		
		cm = (int) (m*100);

		System.out.println("Se ha registrado el lanzamiento de " + cm + " centímetros");

		sc.close();

	}

}
