package actividades_de_aplicacion;

public class Actividad_de_Aplicacion_1_20 {

	public static void main(String[] args) {

		// Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el
		// programa utilizando el nombre cualificado de las clases , en lugar de
		// utilizar ninguna importación.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Introduce un número y calcularé su raíz cuadrada");
		double num = Double.parseDouble(sc.nextLine());
		
		System.out.println("La raiz cuadrada de "+num+" es "+Math.sqrt(num));
		
		sc.close();

	}

}
