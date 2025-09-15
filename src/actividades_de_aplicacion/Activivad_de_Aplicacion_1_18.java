package actividades_de_aplicacion;

import java.util.Scanner;

public class Activivad_de_Aplicacion_1_18 {

	public static void main(String[] args) {

		// Un biólogo está realizando un estudio de distintas especies de invertebrados
		// y necesita una aplicación que le ayude a contabilizar el número de patas que
		// tienen en total todos los animales capturados durante la jornada de trabajo.
		// Para ello, te ha solicitado que escribas una aplicación a la que hay que
		// proporcionar:

		// El número de hormigas capturadas (6 patas)

		// El número de arañas capturadas (8 patas)

		// El número de cochinillas capturadas (14 patas)

		// La aplicación debe mostra el número total de patas.

		int hormiga, arana, cochinilla, totalPatas;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de hormigas que has capturado");
		hormiga = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el número de arañas que has capturado");
		arana = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el número de cochinillas que has capturado");
		cochinilla = Integer.parseInt(sc.nextLine());

		totalPatas = (hormiga * 6) + (arana * 8) + (cochinilla * 14);

		System.out.println("El número total de patas es " + totalPatas);

		sc.close();

	}

}
