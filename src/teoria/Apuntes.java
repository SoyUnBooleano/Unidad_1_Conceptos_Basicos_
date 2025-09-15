package teoria;

public class Apuntes {

	/*
	 * 		INTRODUCCIÓN
	 * 
	 * 		En nuestra vida cotidiana estamos en contacto con multitud de máquinas que,
	 * 		en la mayoría de los casos, simplifican nuestras tareas. La forma que tenemos
	 * 		de comunicarnos con ellas, a través de botones, ruletas o teclas, es lo que
	 * 		se conoce como interfaz hombre-máquina. Supongamos que queremos cocinar en
	 * 		nuestro horno. Lo ideal sería que el horno no tuviera ningún botón ni mando,
	 * 		solo un pequeño micrófono al que pudiéramos dirigirnos y expresarle nuestros
	 * 		deseos: "esta noche me apetece cenar una pizza de espinacas con extra de
	 * 		queso". Por desgracia, este tipo de interfaz todavía no se encuentra en
	 * 		nuestros electrodomésticos. Quizá en unos años.
	 * 
	 * 		Volviendo al presente, un horno sencillo donde solo podamos controlar la
	 * 		temperatura adecuada en cada momento y el tiempo que estaremos cocinando
	 * 		presenta los mandos de temperatura y de tiempo.
	 * 
	 * 		Girando ambas ruedas y colocándolas en la posición deseada podemos configurar
	 * 		o programar el horno. Aunque internamente un horno funciona dejando pasar
	 * 		corriente eléctrica a través de unas resistencias que generan calor, este
	 * 		proceso se interrumpe y continúa, a intervalos, para controlar la temperatura
	 * 		deseada mediante un termostato. Además, todo está dirigido por un cronómetro
	 * 		que se encarga de controlar el tiempo total de funcionamiento. La interfaz,
	 * 		nuestras dos ruedas selectoras de tiempo y temperatura, nos abstrae del
	 * 		verdadero funcionamiento interno del horno. No necesitamos tener ningún
	 * 		conocimiento sobre resistencias, termostatos ni cronómetros. Los mandos hacen
	 * 		invisible el funcionamiento interno y transforman el manejo en algo mucho más
	 * 		sencillo.
	 * 
	 * 		Veamos este mismo proceso para un ordenador, una máquina mucho más compleja
	 * 		que un horno. El funcionamiento interno de un ordenador depende de los
	 * 		voltajes que cambian entre niveles bajos y altos: estos valores se
	 * 		representan también como ceros (0) y unos (1), un sistema de numeración
	 * 		binario, pues estos voltajes -o ceros y unos- que pasan a través de los
	 * 		componentes electrónicos, son los que controlan el funcionamiento de la
	 * 		computadora. Cuando un videojuego o un procesador de textos se ejecutan en un
	 * 		ordenador, es difícil pensar que, en el fondo, no son más que el procesado de
	 * 		ceros y unos por dispositivos electrónicos. Para un humano, programar a
	 * 		través de ceros y unos es algo bastante complicado. Por ejemplo: indicarle a
	 * 		un ordenador que realice una suma se hace a través del código
	 * 		00101010111011000 y una multiplicación es 0011000010101101.
	 * 
	 * 		Aquí se aprecia que, aparte de memorizar multitud de códigos binarios, un
	 * 		pequeño error puede ser un desastre y producir un resultado totalmente
	 * 		distinto del que pretendemos.
	 * 
	 * 		Para solucionar este problema, al igual que en nuestro horno, existe una
	 * 		interfaz hombre-máquina que nos facilita esta tarea. Esta interfaz se
	 * 		denomina lenguaje de programación.
	 * 
	 * 		1.1 ALGORITMO
	 * 
	 * 		Continuando con nuestra cena, para cocinarla nos basta con seguir una serie
	 * 		de instrucciones y seleccionar la posición adecuada de cada mando en cada
	 * 		momento. Dicho de otra forma, tenemos que seguir un conjunto de pasos
	 * 		definidos para resolver el problema: ¿cómo cocinar una pizza?
	 * 
	 * 		Podemos definir un algoritmo como un conjunto finito de instrucciones bien
	 * 		definidas que nos ayudan a resolver un problema. El algoritmo para preparar
	 * 		una pizza, que en el mundo gastronómico se conoce como receta, es:
	 * 
	 * 			1. Introduccir la pizza en el horno. 
	 * 			
	 * 			2. Colocar la temperatura a 150º C. 	
	 * 			
	 * 			3. Colocar el tiempo a 15 min. 
	 * 		
	 * 			4. Esperar 
	 * 		
	 * 			5. Retirar y comer.
	 * 
	 * 		Estamos acostumbrados a utilizar multitud de algoritmos, que son los
	 * 		procedimientos que realizamos de forma mecánica para solucionar un problema.
	 * 		Algunos ejemplos son: recetas de cocina, procesos para realizar operaciones
	 * 		matemáticas (sumas, multiplicaciones, etc.), pulsar los botones adecuados y
	 * 		en el orden correcto para que cualquier máquina haga su trabajo, etcétera.
	 * 
	 * 		Veamos el algoritmo para sumar dos números, utilizando a modo de ejemplos los
	 * 		números 2616 y 3708:
	 * 
	 * 		1. Colocar ambos números en dos filas haciendo coincidir las cifras del mismo
	 * 		orden (unidades con unidades, decenas con decenas y así sucesivamente) dos a
	 * 		dos.
	 * 
	 * 				2 6 1 6 
	 * 			+ 	3 7 0 8
	 * 			____________
	 * 
	 * 		2. Comenzar por la derecha. 
	 * 		3. Hacer la suma de un solo guarismo de cada operando, anotando debajo las 
	 * 		unidades resultantes y en la parte superior del guarismo de la izquierda las decenas, 
	 * 		si existieran.
	 * 
	 * 					1 
	 * 				2 6 1 6 
	 * 			+ 	3 7 0 8 
	 * 			____________ 
	 * 				      4
	 * 
	 * 		4. Repetir el punto 3 con el guarismo de la izquierda.
	 * 
	 * 				 	1 
	 * 				2 6 1 6 
	 * 		    + 	3 7 0 8
	 * 			____________
	 * 				    2 4
	 * 
	 * 		5. Terminar cuando no queden más elemntos por sumar.
	 * 
	 *  			1 	1 
	 *  			2 6 1 6 
	 *  		+ 	3 7 0 8 
	 *  		____________ 
	 *  			6 3 2 4
	 * 
	 * 		1.2 LENGUAJES DE PROGRAMACIÓN
	 * 
	 * 		Un lenguaje de programación puede definirse como un idioma artificial
	 * 		diseñado para que sea facilmente entendible por un humano e interpretable por
	 * 		una máquina. Consta de una serie de reglas y de un conjunto de órdenes o
	 * 		instrucciones. Cada una de estas instrucciones realiza una tarea determinada.
	 * 		A través de una secuencia de instrucciones podemos indicar a una computadora
	 * 		el algoritmo que debe seguir para solucionar un problema dado. A un algoritmo
	 * 		escrito utilizando las instrucciones de un lenguaje de programación se le
	 * 		denomina programa.
	 * 
	 * 		Existen multitud de lenguajes de programación, cada uno con sus ventajas e
	 * 		inconvenientes. Disponemos de lenguajes especializados para realizar cálculos
	 * 		científicos, para escribir videojuegos o para programar robots. Por ejemplo,
	 * 		Fortran es un lenguaje de programación diseñado para realizar aplicaciones
	 * 		científicas. Podemos utilizarlo para calcular operaciones complejas
	 * 		fácilmente, pero sería tremendamente laborioso utilizarlo para escribir un
	 * 		videojuego. Igualmente existen lenguajes de propósito general -como por
	 * 		ejemplo el lenguaje C- que no están especializados en un campo concreto, pero
	 * 		con los que podemos realizar casi cualquier tarea con un mayor o menos
	 * 		esfuerzo.
	 * 
	 * 		Entre todos los lenguajes hemos elegido Java por ser de propósito general,
	 * 		sencillo y didáctico, sin dejar de ser potente y escalable. Quizá, junto al
	 * 		lenguaje C, sea el lenguaje de programación más utilizado por empresas e
	 * 		instituciones científicas y académicas.
	 * 
	 * 		--- Argot técnico ---
	 * 
	 * 		Para conocer cuales son los lenguajes más utilizados existen distintos sitios
	 * 		que realizan mediciones del número de proyectos que usan un lenguaje
	 * 		concreto.
	 * 
	 * 		Entre estos sitios destaca el índice TIOBE, que mide la popularidad de
	 * 		programación. Esta se calcula a partir del número de resultados que
	 * 		proporcionan las consultas en los principios motores de búsquedas para un
	 * 		lenguaje de programación.
	 * 
	 * 		1.2.1. LENGUAJES COMPILADOS E INTERPRETADOS
	 * 
	 * 		Un lenguaje de programación está diseñado para que una persona escriba
	 * 		fácilmente algoritmos, pero la circutería de un ordenador no comprende ningún
	 * 		lenguaje distinto al sistema binario. ?Cómo se consigue que un ordenador
	 * 		comprenda lo que se ha escrito mediante un lenguaje de programación? La
	 * 		solución es utilizar una herramienta llamada compilador, que transforma el
	 * 		conjunto de órdenes o instrucciones que escribimos utilizando cualquier
	 * 		lenguaje de programación -- también llamado código fuente --- en los ceros y
	 * 		unos que son comprensibles por la circuitería de la máquina, lo que se llama
	 * 		código máquina.
	 * 
	 * 		Con esta solución tan elegante podemos programar una máquina tan compleja
	 * 		como un ordenador, casi de la misma forma en la que utilizamos un horno,
	 * 		abstrayéndonos de su funcionamiento interno, sin conocimientos de electrónica
	 * 		y sin necesidad de entender todas y cada una de sus partes.
	 * 
	 * 		Existen dos enfoques para realizar el proceso de traducción del lenguaje de
	 * 		programación (código fuente) al código máquina. El primero, llamado
	 * 		compilación, que ya hemos visto, traduce todas las instrucciones del código
	 * 		fuente y almacena el código fuente y almacena el código máquina generado.
	 * 		Esto permite ejecutar el programa, sin volver a compilarlo, tantas veces como
	 * 		se necesite y sin disponer del código fuente.
	 * 
	 * 		El otro enfoque se denomina interpretación y consiste en traducir el código
	 * 		fuente instrucción a instrucción e ir ejecutando, es decir, solo se traduce y
	 * 		ejecuta la siguiente instrucción que necesitamos. El proceso continuará
	 * 		sucesivamente hasta que la ejecución termine. Por regla general, el código
	 * 		máquina obtenido en la interpretación no se suele almacenar, lo que obliga a
	 * 		volver a interpretar cada vez que se necesite ejecutar un programa.
	 * 
	 * 		A partir del proceso de compilación e interpretación vamos a introducir dos
	 * 		nuevos conceptos:
	 * 
	 * 		-- Tiempo de compilación: es el intervalo de tiempo durante el cual se
	 * 		compila un programa.
	 * 
	 * 		-- Tiempo de ejecución: es el intervalo de tiempo durante el cual un programa
	 * 		se ejecuta.
	 * 
	 * 		De los distintos estadios por los que pasa un programa es importante entender
	 * 		en cuál de ellos estamos, ya que los tipos de comprobaciones y chequeos que
	 * 		se realizan dependen de la etapa en la que nos hallemos.
	 * 
	 * 		1.2.2. LENGUAJES MULTIPLATAFORMA
	 * 
	 * 		El lenguaje C necesita que un mismo program se compile para cada combinación
	 * 		de tipo de máquina -- IBM-PC, Macintosh, SPARC, etc. -- y sistema operativo
	 * 		donde se va a ejecutar. Esto se debe a que el código máquina varía según los
	 * 		estándares hardware y software donde se va a ejecutar; estos definen el
	 * 		entorno de ejecución, también llamado plataforma.
	 * 
	 * 		Aunque se pueda ejecutar en distintas plataformas, el lenguaje C requiere el
	 * 		compilado específico para cada una de ellas. Por ese motivo, no se considera
	 * 		un lenguaje multiplataforma.
	 * 
	 * 		Java se concibió como un lenguaje para internet y, por lo tanto, necesita ser
	 * 		multiplataforma, para que un mismo programa se compile una única vez y pueda
	 * 		ser ejecutado en multitud de ordenadores y sistemas operativos completamente
	 * 		diferentes. El compilador de Java no genera un código máquinadea dependiente
	 * 		de ninguna plataforma: en su lugar, genera un código binario especial llamdo
	 * 		bytecode de Java. Este no es ejecutable directamente por ningún ordenador, ya
	 * 		que es independiente de cualquier plataforma y ha sido ideado como un código
	 * 		intermedio por los implementadores de Java. Para poder ejecutarlo la solución		
	 * 		está en disponer de un intérprete en cada equipo, que traduce el bytecode de
	 * 		Java al código máquina nativo de cada plataforma.
	 *
	 * 		Al programa que interpretea el bytecode se le conoce como Máquina Virtual de
	 * 		Java o JVM, por sus siglas en inglés.
	 * 
	 * 		De esta forma, se consigue que Java sea un lenguaje multiplataforma: un mismo
	 * 		programa, una vez compilado, se puede ejecutar en cualquier ordenador que
	 * 		tenga instalada la Máquina Virtual de Java, que no es más que un intérprete
	 * 		de bytecode.
	 * 
	 * 		Para el caso concreto de Java, vamos a afinar los conceptos de:
	 * 
	 * 		-- Tiempo de compilación: es el espacio de tiempo en el que se traduce el
	 * 		código fuente al bytecode.
	 * 
	 * 		-- Tiempo de ejecución: es el tiempo durante el cual el bytecode se
	 * 		interpreta ( por la JVM ) y se ejecuta por la plataforma correspondiente.
	 * 
	 * 		1.3. ¿CUÁL ES EL PROPÓSITO DE ESTOS APUNTES?
	 * 
	 * 		El objetivo principal de estos apuntes es doble. En primer lugar, que el
	 * 		lector conozca y aprenda el funcionamiento de las instrucciones o sentencias
	 * 		que proporciona Java y, en segundo lugar, que sea capaz de utilizarlas para
	 * 		escribir algoritmos correctos que resuelvan problemas reales. EStos pueden
	 * 		ser tan simples como calcular la suma dos números o tan complejos como
	 * 		gestionar la parte financiera de una empresa o desarrollar un videojuego.
	 * 
	 * 		Aquí hay que hacer hincapié en que el conocimiento de Java no implica saber
	 * 		programar correctamente. Dicho de otro modo, conocer el funcionamiento
	 * 		individual de cada instrucción no garantiza el éxito; este se consigue
	 * 		teniendo una visión global del problema, conociendo y aplicando técnicas
	 * 		algorítmicas y escribiendo las instrucciones en el orden correcto.
	 * 
	 * 		1.5. EL PROGRAMA PRINCIPAL
	 * 
	 * 		Cuando se aprende a programar, durante la primera etapa, es posible que la
	 * 		frase <<Esto requiere unos conocimientos que están fuera del alcance de un
	 * 		principante>> aparezca demasiadas veces. Pero aquí está plenamente
	 * 		justificada: más adelante veremos los conceptos de clase y función, pero, por
	 * 		ahora, para escribir los primeros programas, utilizaremos:
	 * 
	 * 		package miprimerprograma; 
	 * 		public class MiPrimerPrograma {
	 * 
	 * 			public static void main(String[] args) { 
	 * 			algoritmo 
	 * 			} 
	 * 		}
	 * 
	 * 		Al escribir un programa en Java usaremos literalmente la fórmula anterior,
	 * 		aunque todavía no la comprendamos. De hecho, ni siquiera tendremos que
	 * 		escribir nada, ya que el entorno de desarrollo la escribirá por nosotros.
	 * 		Sólo tenmos que sustituir algoritmo por el conjunto de instrucciones que
	 * 		necesitemos.
	 * 
	 * 		Hay que destacar que la primera línea de código,
	 * 
	 * 		package miprimerprograma;
	 * 
	 * 		especifica que nuestro programa se agrupará en el paquete miprimerprograma.
	 * 		El nombre del paquete dependerá del nombre del proyecto; dicho de otra forma,
	 * 		Eclipse escribirá un nombre distinto de paquete dependiendo del nombre que se
	 * 		asigne a los proyectos.
	 * 
	 * 		1.6. PALABRAS RESERVADAS	 * 
	 *  
	 * 		abstract 	continue 	float 	native 		strictfp 	void 	assert 	default 
	 * 		for 			new 		super 	volatile 	boolean 	do 		if 		package 
	 * 		switch 		while 		break 	double 		implements 	private enum	synchronized 
	 * 		yield 		byte 		else 	import 		protected 	this 	case 	instanceof
	 * 		public 		throw 		catch 	extends 	int 		return 	throws 	char 
	 * 		final 		interface 	short 	transient 	class 		finally long 	static 	try
	 * 
	 * 		Al conjunto anterior hay que sumar dos palabras reservadas muy curiosas:
	 * 		const y goto, que no pueden utilizarse en el lenguaje, pero aún así están
	 * 		reservadas. Además, existen tres valores literales: true, false y null, que
	 * 		tienen también un significado especial para el lenguaje, con un estatus
	 * 		parecido a una palabra reservada.
	 * 
	 * 		Las palabras reservadas solo pueden escribirse en determinado lugar de un
	 * 		programa y no pueden ser utilizadas como identificadores.
	 * 
	 * 		1.7. CONCEPTO DE VARIABLE
	 * 
	 * 		Una variable es una representación, mediante un
	 * 		identificador, de un valor, que puede cambiar durante la ejecución de un
	 * 		programa. A las variables se les asignan valores concretos por medio del
	 * 		operador de asignación (=). Ejemplo de ello es:
	 * 
	 * 			a = 3
	 * 
	 * 		Aquí el nombre o identificador de la variable es a, el valor asignado es 3.
	 * 		Es no significa que posteriormente no pueda cambiar su valor por otro. Otro
	 * 		ejemplo:
	 * 
	 * 			a = 10 
	 * 			b = a + 1
	 * 
	 * 		Utilizamos dos variables a y b. En la primera asignación damos un valor de 10
	 * 		a a la variable a, y en la segunda asignación damos a b el valor que tuviera
	 * 		más 1. Como a vale 10, b tomará un valor de 10 más 1, es decir, 11.
	 * 
	 * 		1.7.1. Identificadores
	 * 
	 * 		El nombre con el que se identifica cada variable se denomina identificador.
	 * 		Hay que tener en cuenta que Java distingue entre mayúsculas y minúsculas, es
	 * 		decir, el identificador edad es distindo a eDaD. Además, no podemos utilizar
	 * 		como identificador ninguna palabra reservada del lenguaje. Los
	 * 		identificadores deben seguir las siguientes reglas:		
	 * 
	 * 		-- Comienzan siempre por una letra, un subrayado (_) o un dólar ($).
	 * 
	 * 		-- Los siguientes caractéres pueden ser letras, dígitos, subrayado (_) o
	 * 		dólar($).
	 * 
	 * 		-- Se hace distinción entre mayúsculas y minúsculas
	 * 
	 * 		-- No hay una longitud máxima para el identificador.
	 * 
	 * 		Existe una regla de estilo que recomienda distinguir las palabras que forman
	 * 		un identificador escribiendo en mayúscula la primera letra de cada palabra.
	 * 		Esta notación hace que el aspecto del identificador se asemeje a las jorobas
	 * 		de un camello, de ahí su nombre: notación Camel. Algunos ejemplos de
	 * 		identificadores que usen la anotación Camel son los siguientes: edad,
	 * 		maxValor, numCasasLocalidad o notaMediaTercerTrimestre.
	 * 
	 * 		1.8. TIPOS PRIMITIVOS
	 * 
	 * 		En un programa de ejecución, las variables se almacenan en memoria del ordenador. Cada una
	 * 		de ellas necesita un tamaño adecuado para guardar sus valores. Un tamaño pequeño no permite 
	 * 		guardar valores grandes y un tamaño grande desaprovecha memoria.
	 * 
	 *  	Vamos a utilizar la variable nota para guardar las calificaciones de los alumnos (0-10 sin decimales).
	 *  	Con un tamaño en memoria para dos digitos será suficiente. En realidad, el tamaño en memoria se
	 *  	mide en bytes, no en dígitos, pero utilizaremos dígitos en esta ocasión para explicar mejor el ejemplo.
	 *  
	 *  		nota = 10
	 *  
	 *  	Si empezamos a utilizar notas con decimales o calificaciones superiores a 99, ya no nos vale
	 *  	ya que el valor no se podría guardar en la variable.
	 *  
	 *  	Lo ideal sería que cada variable reserve un espacio lo suficientemente grande para que pueda
	 *  	almacenar todos los valores que guardará en algún momento.
	 *  	
	 *  	La solución a este problema no es definir el tamaño de memoria para cada variable, sino definir unos
	 *  	tipos de variables, con unos tamaños y rangos de valores conocidos, y que las variables
	 *  	utilizadas en nuestros programas se ciñan a estos tipos.
	 *  
	 *  	En Java encontramos los tipos predefinidos: byte, short, int, long, float, double, boolean y char,
	 *  	también conocidos como tipos primitivos.
	 *  
	 *  	1.8.1. Variables de tipo primitivo
	 *  
	 *  	Al escribir un programa debemos indicar a qué tipo pertenece cada variable. En este proceso recibe
	 *  	el nombre de declaración de variables y se hará forzosamente antes de su primer uso.
	 *  
	 *  		double importe;
	 *  
	 *  	Todas las declaraciones terminan en punto y coma (;), aunque es posible declarar a la vez varias del
	 *  	mismo tipo, separándolas por comas(,):
	 *  
	 *  		double importe, total, suma;
	 *  
	 *  	Podemos asignar un valor ( inicializar ) a una variable en el momento de declararla.
	 *  
	 *  		double importe = 100.75;
	 *  
	 *  	Las variables de tipo primitivo a las que no se les asigna un valor en su declaración se inicializan
	 *  	automáticamente por defecto, de la siguiente forma: 0 para los tipos numéricos y char; y y false
	 *  	para las booleanas.
	 *  
	 *  	1.8.2. RANGOS
	 *  
	 *  	Tamaño y rango de valores que puede almacenar cada tipo primitivo:
	 *  
	 *  	Tipo			Uso							Tamaño		Rango
	 *  	
	 *  	byte		entero corto					8 bits		de -128 a 127
	 *  
	 *  	short		entero							16 bits		de -32768 a 32767
	 *  
	 *  	int			entero							32 bits		de -2147483648 a 2147483647
	 *  
	 *  	long		entero largo					64 bits		de +- 9223372036854775808
	 *  
	 *  	float		real precisión sencilla			32 bits		de -10³² a 10³²
	 *  
	 *  	double		real precisión doble			64 bits		de -10³⁰⁰ a 10³⁰⁰
	 *  
	 *   	boolean		lógico							1 bit		true o false
	 *   
	 *   	char		texto							16 bits		cualquier carácter
	 *   
	 *   	
	 *   	Java impide que le asignemos a una variable un valor fuera del rango permitido por el tipo al
	 *   	que pertenece.
	 *   
	 *   		byte a = 300;
	 *   
	 *   	Esta declaración produce error en el compilador.
	 *   
	 *   	Para evitar el desbordamiento como resultado de un cálculo, los rangos de Java funcionan de forma
	 *   	circular; cuando se sobrepasa el valor máximo, se vuelve al valor mínimo del rango y viceversa.
	 *   
	 *   	Por tanto:
	 *   
	 *   		byte a = 127;
	 *   		a = a + 1;
	 *   
	 *  	a tendría un valor de -128.
	 *  
	 *  	1.9. VARIABLES DE OBJETO
	 *  
	 *  	Es posible declarar variables cuyo tipo no sea un tipo primitivo, sino una clase. Por ahora, pensaremos
	 *  	en las clases como tipos de datos complejos, hasta que las estudiemos en profundidad en el tema 7.
	 *  
	 *  	1.10. CONSTANTES
	 *  
	 *  	Las constantes son un caso especial de variables, donde, una vez que se les asigna su primer valor, este
	 *  	permanece inmutable durante el resto de programa.
	 *  
	 *  	La declaración de constantes es similar a la de variables, pero añadiendo la palabra reservada final:
	 *  
	 *  		final tipo nombreConstante;
	 *  
	 *  	La mayoría de los programadores suelen escribir sus códigos siguiendo una guía de estilos. Es habitual que
	 *  	que los identificadores de las constantes se escriban en mayúscula.
	 *  
	 *  		final byte MAYORIA_EDAD = 18;
	 *  		final double PI = 3.141592;
	 *  		final int NUM_ALUMNOS;
	 *  		NUM_ALUMNOS = aulas * 30;		->		El valor es fruto de una expresión
	 *  
	 *  	Una vez asignado el valor a una constante, si intentamos modificarla, se producirá un error.
	 *  
	 *  	1.11. COMENTARIOS
	 *  
	 *  	El objetivo de los comentarios es doble: describir la funcionalidad del código (qué hace) y facilitar
	 *  	la comprensión de la solución implementada (cómo lo hace).
	 *  
	 *  	Se considera una buena práctica escribir códigos bien documentados y esto ayuda al mantenimiento del código
	 *  	a la hora de trabajar con otros programadores.
	 *  
	 *  	Java disponde de tres tipos de comentarios:
	 *  
	 *  	-- Comentario multilínea: cualquier texto incluido entre los caracteres barra asterico (apertura de comentario)
	 *  	y asterisco barra (cierre de comentario) será interpretado com un comentario, y puede extenderse a través de las
	 *  	líneas.
	 *  
	 *  	-- Comentario hasta final de línea: todo lo que sigue a las carácteres // hasta el final de la línea se considera
	 *  	comentario.
	 *  
	 *  	-- Comentario de documentación: similar al comentario multilínea, con la diferencia de que, para iniciarlo, se
	 *  	utilizan los caracteres /**. Existen herramientas que generan documentación automática a partir de este
	 *  	tipo de comentarios.
	 *  
	 *  	1.12. API DE JAVA
	 *  
	 *  	Una de las grandes ventajas de los lenguajes de programación modernos es que disponen de una amplia biblioteca
	 *  	de herramientas que realizan tareas complejas de forma transparente al programador que las utiliza, facilitando
	 *  	su tarea.
	 *  
	 *  	En el caso de que un lenguaje de programación no disponga de alguna herramienta específica, es necesario que sea
	 *  	el propio programador quien la construya, con los incovenientes que esto conlleva. Es indudable que el hecho de
	 *  	disponer de herramientas facilita la labor del programar: por un lado se ahorra tiempo y trabajo, al no tener que
	 *  	implementarlas; y por otro, aporta un extra de seguridad al tener la certeza de que estas herramientas funcionan
	 *  	bien, ya que han sido diseñadas y comprobadas por programadores expertos.
	 *  
	 *  	A estas herramientas, en Java, se les denomina clases y facilitan multitud de tareas. Algunos ejemplos de las
	 *  	funcionalidades que nos brindan son:
	 *  
	 *  	-- Lectura de datos: leen información desde el teclado, desde un fichero o desde otros dispositivos.
	 *  	
	 *  	-- Cálculos complejos: realizan operaciones matemáticas como raíces cuadradas, logaritmos, cálculos
	 *  	trigonométricos, etcétera.
	 *  	
	 *  	-- Manejo de errores: controlan la situación cuando se produce un error de algún tipo.
	 *  	
	 *  	-- Escritura de datos: escriben información relevante en dispositivos de almacenamiento, impresoras, monitores, etc.
	 *  
	 *  	Estos son solo algunos ejemplos, pero la cantidad de clases que se distribuyen con Java es enorme y cubren las
	 *  	necesidades típicas de un programador. A toda esta biblioteca de clases se le denomina API, que son las siglas
	 *  	en inglés de "interfaz de programación de aplicaciones".
	 *  
	 *  	1.2.1. PAQUETES
	 *  
	 *  	El número de clases de la API es tal que, para facilitar su organización, se agrupan según su funcionalidad.
	 *  	A una agrupación de clases se le denomina paquete. Los paquetes pueden agruparse, a su vez, en otros paquetes.
	 *  	Por ejemplo, la clase Math, que proporciona herramientas para realizar cálculos matemáticos, se engloba dentro
	 *  	del paquete lang que engloba clases que son fundamentales para el lenguaje, y que a su vez se encuentran dentro
	 *  	del paquete java.
	 *  
	 *  	Cada clase se identifica mediante su nombre completo que incluye la estructura de paquetes junto al nombre de 
	 *  	la clase. Por ejemplo: java.lang.Math
	 *  
	 *  	A su vez, una clase proporciona una o varias funcionalidades, que se denominan métodos. Math, entre otros, dispone
	 *  	de los métodos sqrt(), que calcula una raíz cuadrada, abs(), que calcula el valor absoluto de un número, o
	 *  	de random(), que selecciona un número aleatorio.
	 *  
	 *  	Para utilizar cualquier clase de la API, tendremos que escribir su nombre cualificado. Por ejemplo, para declarar
	 *  	una variable para guardar la hora utilizaremos la clase LocalTime, que está ubicada dentro del paquete java.time.
	 *  
	 *  		java.time.LocalTime queHoraEs;
	 *  
	 *  	Para usar cualquier método de una clsae de la API, tendremos que escribir el nombre del método junto al nombre
	 *  	cualificado de la clase a la que pertenece. Para asignar a la variable queHoraEs la hora actual del sistema
	 *  	usaremos el metodo now() de la clase LocalTime:
	 *  
	 *  		java.time.LocalTime queHoraEs = java.time.LocalTime.now();
	 *  
	 *  	Tener que escribir continuamente el nombre cualificado de una clase puede llegar a swer engorroso. Una alternativa
	 *  	es declarar que vamos a utilizar una clase concreta, mediante la palabra reservada import. De la forma:
	 *  
	 *  		import java.time.LocalTime:
	 *  
	 *  	que se interpreta como: voy a necesitar en mi programa la clase LocalTime, que se encuentra dentro del paquete
	 *  	time, que a su vez se encuentra dentro del paquete java. La sentenecia import se coloca justo debajo de la 
	 *  	declaración del paquete. Tras importar una clase, ya no es necesario escribir su nombre cualificado.
	 *  
	 *  		LocalTime queHoraEs = LocalTime.now();
	 *  
	 *  	Es posible importar tantas clases como necesitemos y el hecho de importar una clase no nos obliga a utilizarla;
	 *  	tan solo acorta su escritura en la expresión donde la utilicemos. Es posible importar todas las clases de un paquete
	 *  	mediante un asterisco:
	 *  
	 *  		import java.time*; 		->		Importa todas las clases del paquete java.time
	 *  
	 *  	Con respeto al mecanismo de importación, el paquete java.lang es una excepción. Al albergar clases fundamentales
	 *  	para Java se necesitan sus clases en casi cualquier programa. Por este motivo, es el propio compilador el que 
	 *  	importa de forma automática todas las clases del paquete java.lang, sin que tengamos que hacerlo nosotros.
	 *  
	 *  	Cada clase que compone la API puede utilizarse de dos modos:
	 *  
	 *  	-- De forma estática: se usa directamente el método. Por ejemplo la clase Math:
	 *  
	 *  		raiz = Math.sqrt(16);	->		Calcula la raiz cuadrada de 16, que resulta 4.0.
	 *  
	 *  	-- De forma no estática: esta manera de utilizar las clases requiere del operador new. Un ejemplo la clase Scanner,
	 *  	que permite que el usuario introduzca datos en una aplicación.
	 *  
	 *  		Scanner sc = new Scanner(System.in);
	 *  		sc.close();
	 *  
	 *  	1.12.2. SALIDA POR CONSOLA
	 *  
	 *  	Una de las operaciones más básicas que proporciona la API es aquella que permite mostrar mensajes en el monitor.
	 *  	Cuando los mensajes se muestran de forma simple, en modo texto y sin interfaz gráfica, se habla de salida
	 *  	por consola. Java dispone para ello de la clase System con los métodos:
	 *  
	 *  	-- System.out.print("Mensaje"), que muestra literalmente el mensaje en el monitor.
	 *  
	 *  	-- System.out.println("Mensaje"), que inserta una nueva linea tras el mensaje.
	 *  
	 *  	El uso de la clase System es tan básico que no es necesario importarla. 
	 *  
	 *  	Para combinar la salida de mensajes literales de texto y el valor de la variables utilizaremos "+", que nos 
	 *  	permite unir todos los elementos que deseemos para formar el mensaje de salida.
	 *  
	 *  		int edad = 12;
	 *  		System.out.print("Su edad es de " + edad " años.");
	 *  
	 *  	Se obtiene en el monitor:
	 *  		
	 *  		Su edad es de 12 años.
	 *  
	 *  	Lo que está entrecomillado se muestra literalmente y lo que no se evalúa.
	 *  
	 *  	También podemos utilizar el carácter especial \n para insertar una nueva línea.
	 *  
	 *  		System.out.println("Hola.");
	 *  		System.out.print("La hora \ndel sistema es:\n);
	 *  		System.out.print(queHoraEs);
	 *  
	 *  	Aparece en pantalla:
	 *  
	 *  		Hola.
	 *  		La hora
	 *  		del sistema es:
	 *  		10:20:32.294
	 *  
	 *  	1.12.3. ENTRADA DE DATOS
	 *  
	 *  	Otra operación muy utilizada consiste en recabar información del usuario a través del teclado. Cuando se hace
	 *  	de forma simple, en modo texto, sin ratón ni interfaz gráfica, se dice que obtenemos datos por consola.
	 *  
	 *  	Scanner es una clase de la API que se utiliza de forma no estática, es decir, necesita el operador new. Y la
	 *  	forma de trabajar con ella siempre es la misma: en primer lugar tendremos que crear un nuevo escáner.
	 *  
	 *  		Scanner sc = new Scanner(System.in);
	 *  
	 *  	System.in indica que vamos a leer del teclado. Una vez creado nuestro escaner, que hemos llamado sc, ya solo
	 *  	que utilizarlo. Para ello disponemos de los métodos:
	 *  
	 *  	-- sc.nextInt(): lee un número entero por teclado.
	 *  	
	 *  	-- sc.nextDouble(): lee un número real.
	 *  
	 *  	-- sc.nextLine(): lee una cadena de caracteres hasta que se pulse intro.
	 *  
	 *  	-- sc.next(): lee una cadena de caracteres hasta que se encuentra un tabulador, un espacio en blanco o un Intro.
	 *  
	 *  	Las sentencias para introducir datos por teclado funcionan de la siguiente forma:
	 *  
	 *  		1. Se detiene la ejecución del programa y se espera a que el usuario teclee.
	 *  
	 *  		2. Recoge toda la secuencia tecleada hasta que se pulsa Intro.
	 *  
	 *  		3. Todo el contenido tecleado es interpretado y devuelto, normalmente asignándose a una variable.
	 *  
	 *  		4. El programa dispone del dato introducido por el usuario en la variable.
	 *  
	 *  	Un ejemplo:
	 *  
	 *  		Scanner sc = new Scanner(System.in);		->		Crea el nuevo escáner
	 *  		double numero;								->		Declaramos la variable número
	 *  		numero = sc.nextDouble();					->		Se detiene la ejecución del programa hasta que escribamos
	 *  															un número y pulsemos Intro.
	 *  		System.out.pintln("Ha escrito: "+ numero);	-> 		Anteriormente se habrá guardado el numero introducido en la
	 *  															variable y ahora nos lo mostrará en pantalla.
	 *  
	 *  	Para utilizar la clase Scanner, como hemos hecho en el ejemplo anterior, sin tener que escribir su nombre
	 *  	cualificado, la importaremos de la siguiente forma:
	 *  
	 *  		import java.util.Scanner;
	 *  
	 *  	Una vez creado sc podemos utilizarlo para leer tantas veces como necesitemos:
	 *  
	 *  		Scanner sc = new Scanner(System.in);
	 *  		edad = sc.nextInt();						->		Leemos un entero
	 *  		precio = sc.nextDouble();					->		Leemos un real
	 *  
	 *  	Hay que tener en cuenta que al utiliar sc.nextDouble() tenemos que introducir los números con coma decimal (,).
	 *  
	 *  	1.13. OPERACIONES BÁSICAS
	 *  
	 *  	Java dispone de multitud de operadores con los que se pueden crear expresiones utilizando como operadores
	 *  	variables, constantes, números y otras expresiones.
	 *  
	 *  	1.13.1. OPERADORES DE ASIGNACIÓN
	 *  
	 *  	El operador " = " se usa para modificar el valor de una variable.
	 *  
	 *  		variable = expresión
	 *  
	 *  	A la variable se le asigna como valor el resultado de la expresión. Una expresión no es más que una serie de
	 *  	operaciones. Sio en el momento de la asignación la variable tuviera un valor anterior, este se pierde. Ejemplo:
	 *  
	 *  		int total, a;								->		Declaramos dos variables enteras
	 *  		total = 123;								->		La variable total toma un valor de 123
	 * 			total = 0;									->		Ahora toma un valor de 0, el valor de 123 se pierde
	 * 			a = 3;										->		La variable a toma el valor 3
	 * 
	 * 		En estas asignaciones la expresión asignada es un valor explícito y no es una expresión que necesite ser evaluada.
	 * 		Estos valores explícitos se llaman literales. Por ejemplo, 123 es un literal entero, mientras que 2,5 es un
	 * 		literal double. En cambo;
	 * 
	 * 			total = 2 * a;								->		total toma como valor el resultado de 2 por el valor de la
	 * 																variable a (que es 3). Es decir, 6
	 * 			total = total - 5;							->		A total se le asigna el valor de total (que es 6) menos 5.
	 * 																Es decir 1.
	 * 
	 * 		Ahora a total se le asigna dos expresiones que necesitan ser evaluadas antes de la asignación.
	 * 
	 * 		1.13.2 OPERADORES ARITMÉTICOS
	 * 
	 * 		El operador " - " sirve para cambiar el signo de la expresión que le sigue.
	 * 
	 * 			a = 1;
	 * 			b = -a;										->		b vale -1
	 * 
	 * 		El operador " % " devuelve el resto de dividir el primer operando entre el segundo. Por ejemplo, 7 % 3 vale 1,
	 * 		ya que al dividir 7 entre 3 el resto es 1.
	 * 
	 * 		
	 * 			Símbolo							Descripción
	 * 
	 * 				+							Suma
	 * 	
	 * 				+							Más unario: positivo
	 * 
	 * 				-							Resto
	 * 
	 * 				-							Menor unario: negativo
	 * 
	 * 				*							Multiplicación
	 * 
	 * 				/							División
	 * 
	 * 				%							Módulo
	 * 
	 * 				++							Incremento en 1
	 * 
	 * 				--							Decremento en 1
	 * 
	 * 
	 * 		Los operadores " ++ " y " -- " se utilizan para incrementar o decrementar una variable en 1.
	 * 
	 * 			a ++;
	 * 			b --;
	 * 
	 * 		es equivalente a :
	 * 			
	 * 			a = a + 1;
	 * 			b = b - 1;
	 * 
	 * 		En un programa el incremento o decremento de una variable es algo tan usual que estos operadores están pensados
	 * 		con el único propósito de ahorrar trabajo al programador a la hora de teclear, y de paso, hacer el código más
	 * 		compacto, legible y eficiente. Ambos operadores pueden utilizarse de manera prefija ( ++a; ) o posfija ( a++ ),
	 * 		y su comportamiento es distinto. Cuando se utiliza como prefijo, el operador tiene precedencia sobre el resto
	 * 		de operaciones de la expresión. Y usado como posfijo, se realiza antes cualquier otra operación, dejando el
	 * 		incremento para el final. 
	 * 
	 * 			int a, b, c;								->		Declaramos las variables tipo entero
	 * 			a = 1;										->		A la variable a le asignamos 1.
	 *			b = a++;									->		Primero le asignamos el valor de " a " a " b ", y
	 *																después incrementamos " a ".
	 *			c = ++ a;									->		Primero incrementamos " a ", y después asignamos su
	 *																valor a " c ".
	 *
	 * 		Después de estas líneas de código, a vale 3, b vale 1 y c vale 3.
	 * 
	 * 		1.13.3. OPERADORES RELACIONALES
	 * 
	 * 		Son aquellos que producen un resultado lógico o booleano a partir de las comparaciones de expresiones numéricas.
	 * 		El resultado solo permite dos posibles valores: verdadero o falso.
	 * 
	 * 		-- 3 < 5. Devuelve true.
	 * 
	 * 		-- 3 == 5. Devuelve false
	 * 	
	 * 		-- 3 <= 5. Devuelve true.
	 * 
	 * 		-- 3 <= 3. Devuelve true.
	 * 
	 * 		-- 3 != 4. Devuelve true.
	 * 
	 * 				Símbolo						Descripción
	 * 
	 * 				==							Igual que
	 * 
	 * 				!=							Distinto que
	 * 
	 * 				<							Menor que
	 * 
	 * 				<=							Menor o igual que
	 * 
	 * 				>							Mayor que
	 * 
	 * 				>=							Mayor o igual que
	 * 
	 * 		1.13.4. OPERADORES LÓGICOS
	 * 
	 * 		Permiten operar a partir de expresiones lógicas.
	 * 
	 * 				Símbolo						Descripción	
	 * 
	 * 				&&							Operador and: Y
	 * 
	 * 				||							Operador or: O
	 * 
	 * 				!							Operador not: negación
	 * 
	 * 		La expresión formada a partir de otras dos unidas por el operador and será true cuando ambas expresiones utilizadas
	 * 		se evaluen como ciertas. En caso contrario se evaluan como falsas.
	 * 
	 * 			-- 3 <=5 && 2 == 2 son ciertas. Devuelve true.
	 * 
	 * 			-- 3 <=5 && 2 > 10. La última expresión es falsa. Devuelve false.
	 * 
	 * 		El operador or será cierto cuando alguna de las expresiones que lo formen sea cierta.
	 * 
	 * 			-- 1 != 2 || 5 < 3. Sólo la primera expresión es verdadera. Devuelve true.
	 * 
	 * 		El operador not es un operador unario que cambia los valores booleanos de cierto a falso y viceversa.
	 * 
	 * 			-- !(1<2). La expresión en sí es verdadera, pero cambia de valor con el operador not. Devuelve false.
	 * 
	 * 		1.13.5 OPERADORES OPERA Y ASIGNA
	 *
	 *		Existen otros operadores que realizan la operación indicada tomando como operandos el valor de la variable
	 *		a la izquierda y el valor a la derecha del =. El resultado se asigna a la misma variable utilizada como	
	 *		primer operando.
	 *
	 *				Símbolo						Descripción
	 *
	 *				+=							Suma y asigna
	 *		
	 *				-=							Resta y asigna
	 *
	 *				*= 							Multiplica y asigna
	 *
	 *				/=							Divide y asigna
	 *
	 *				%=							Módulo y asigna
	 *
	 *		Todos tienen el mismo funcionamiento.
	 *
	 *			var += 3;
	 *
	 *		Es equivalente a:
	 *
	 *			var = var + 3;
	 *
	 *		De igual forma 
	 *
	 *			x *= 2;
	 *
	 *		es equivalente a:
	 *
	 *			x = x * 2;
	 *
	 *		1.13.6. OPERADOR TERNARIO
	 * 
	 * 		Este operador devuelve un valor que se selecciona entre dos posibles. La selección dependerá de la evaluación
	 * 		de una expresión lógica que puede tormar dos valores: verdadero o falso.
	 * 
	 * 			expresiónCondicional ? valor1 : valor2
	 * 
	 * 		En caso de que la expresión resulte cierta, se devuelve valor1, en caso contrario, se devuelve valor2.
	 * 
	 * 		Veamos un ejemplo:
	 * 
	 * 			int a, b;
	 *			a = 3 < 5 ? 1 : -1; 						->	 Es cierto, a toma el valor 1.
	 *			b = a == 7 ? 10 : 20;						->	 Es falso, b toma el valor 20.
	 *		
	 *		1.13.7. Precedencia
	 *
	 *				Descripción					Operador
	 *
	 *				Posfijos					expr++ expr--
	 *
	 *				Unarios prefijos			++expr --expr +expr -expr !expr
	 *
	 *				Aritméticos					*  /  %
	 *
	 *				Relacionales				< <= > >=
	 *
	 *				Comparación					==	!=
	 *
	 *				AND lógico					&&
	 *
	 *				OR lógico					||
	 *
	 *				Ternario					? :
	 *
	 *				Asignación					= += -= *= /= %= &= ^=
	 *
	 *		En la tabla se muestran los operadores ordenados de mayor a menor. La precedencia establece qué operaciones se
	 *		realizan antes. Con igualdad de precedencia, las operaciones se realizan en el mismo orden en el que se escriben:
	 *		de izquierda a derecha.
	 *
	 *			-- En la expresión: 2 + 3 * 4, el operador * tiene precedencia mayor que el operador +.
	 *
	 *			-- En cambio, en la expresión: 3 <=5 && 2==2, el operador con mayor precedencia es <=, que será la primera
	 *			operación que se realice.
	 *
	 *		La precedencia puede romperse utilizando paréntesis.
	 *
	 *			(2 + 3) * 4
	 *
	 *		1.14. CONVERSIÓN DE TIPOS
	 *
	 *		Cuando asignamos un valor a una variable, ambos deben ser del mismo tipo.
	 *
	 *			int a = 2;
	 *			double x = 2.3;
	 *
	 *		Cada tipo se caracteriza por un ocupar un tamaño en memoria.
	 *
	 *		Si escribimos:
	 *
	 *			int a = 2.6;					->		trata de asignar un valor real a una variable entera.
	 *		
	 *		el compilador nos avisará de que estamos cometiendo un error y no nos dejará ejecutar. La razón de este control
	 *		de tipos tan estricto es evitar errores durante la ejecución del programa, ya que es evidente que una variable
	 *		de un tipo no puede almacenar valores con un tamaño superior.
	 *
	 *		Sin embargo, un valor int puede guardarse sin problemas en una variable double.
	 *
	 *			int a = 3;
	 *			double x = a;
	 *
	 *		Java permite esta asignación sin violar la norma de que a una variable double se le asigne un valor double. Para
	 *		ello, Java convierte de forma automática el valor entero 3 en el valor double 3.0 antes de asignarlo a la 
	 *		variable x. Esto es posible porque la variable double es de mayor tamaño que el valor int. Este tipo de conversiones
	 *		serán posibles cuando la variable sea de mayor tamaño que el valor asignado, se habla entonces de 
	 *		conversiones de ensanchamiento.
	 *
	 *		Sin embargo, a veces es interesante guardar la parte entera de un número con decimales en una variable entera.
	 *		Esto supone una pérdida de información. Para ello deberemos colocar un cast delante del valor que queremos
	 *		asignar.
	 *
	 *			int a = (int) 2.6;				->		(int) Indica que el tipo al que se convertirá el valor.
	 *
	 *		El cast es lo que va entre paréntesis. Lo que hace es eliminar (truncar) la parte decimal de 2.6 y convertirlo
	 *		en el entero 2, que podrá ser asignado a una variable a sin problemas.
	 *
	 *		A este tipo de conversión se le llama estrechamiento, ya que fuerza la asignación de un tipo de dato en una
	 *		variable de menor tamaño, eso sí, con perdida de información.
	 *
	 *		--- TEMA 1 TERMINADO ---
	 *
	 *		Hola hola hola
	 *
	 *		
	 *		
	 *
	 *
	 *
	 *		
	 *			
	 *			
	 *  
	 *   
	 *  
	 *  	
	 *  		
	 *
	 *  
	 *  
	 *  	
	 *  
	 *  	
	 *  	
	 *  
	 *  
	 * 
	 * 
	 */

}
