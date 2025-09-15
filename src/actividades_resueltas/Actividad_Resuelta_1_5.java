package actividades_resueltas;

public class Actividad_Resuelta_1_5 {

	public static void main(String[] args) {

		// El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
		// Escribir un programa que compruebe que el rango de valores de un tipo se
		// comporta de forma cíclica, es decir, el valor siguiente al máximo es el valor
		// mínimo.

		short min = -32768;

		System.out.println("El valor mínimo de short es " + min + " y el valor máximo es " + (--min));

	}

}
