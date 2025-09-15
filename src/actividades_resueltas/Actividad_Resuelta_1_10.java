package actividades_resueltas;

import java.util.Scanner;

public class Actividad_Resuelta_1_10 {

	public static void main(String[] args) {

		// Diseñar una algoritmo que nos indique si podemos salir a la calle. Existen
		// aspectos que influirán en esta decisión: si está lloviendo y si hemos
		// terminado nuestras tareas. Solo podremos salir a la calle si no está
		// lloviendo y hemos finalizado nuestras tareas. Existe una opción en la que,
		// indistintamente de lo anterior, podremos salir a la calle: el hecho de que
		// tengamos que ir a la biblioteca ( para realizar algún trabajo, entregar un
		// libro, etc. ). Solicitar al usuario (mediante un booleano) si llueve, si ha
		// finalizado las tareas y si necesita ir a la bibliteca. El algoritmo debe
		// mostrar mediante un booelano (true o false) si es posible que se le otorgue
		// permiso para ir a la calle.

		Scanner sc = new Scanner(System.in);

		boolean lluvia, tarea, biblioteca, salir;

		System.out.println("¿Está lloviendo?");
		lluvia = Boolean.parseBoolean(sc.nextLine());

		System.out.println("¿Has terminado la tarea?");
		tarea = Boolean.parseBoolean(sc.nextLine());

		System.out.println("¿Necesitas ir a la biblioteca?");
		biblioteca = Boolean.parseBoolean(sc.nextLine());

		System.out.println("¿Puedes ir a la calle?");
		salir = (!lluvia && tarea) || biblioteca;

		System.out.println(salir);

		sc.close();

	}

}
