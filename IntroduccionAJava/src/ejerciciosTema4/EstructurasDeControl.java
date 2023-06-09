package ejerciciosTema4;

public class EstructurasDeControl {

	static int numeroIf = 0;
	static int numeroWhile = 0;
	static String estacion = "PRIMAVERA";

	public static void main(String[] args) {
		// Usando un if, crear una condición que compare si la variable numeroIf es
		// positivo, negativo, o 0.
		if (numeroIf < 0) {
			System.out.println("El numero es negativo");
		} else if (numeroIf == 0) {
			System.out.println("El numero es cero");
		} else {
			System.out.println("El numero es positivo");
		}

		// Crea un bucle While, este bucle tendrá que tener como condición que la
		// variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		// bucle deberá:
		// Incrementar el valor de la variable en uno cada vez que se ejecute.
		// Mostrarlo por pantalla cada vez que se ejecute.

		while (numeroWhile < 3) {
			System.out.printf("El numero es %d\n", numeroWhile);
			numeroWhile++;
		}

		// Para el bucle Do While, deberás crear la misma estructura que en el While,
		// pero solo se debe ejecutar una vez.

		do {
			System.out.printf("El numero es %d\n", numeroWhile);
		} while (numeroWhile < 3);

		// Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		// valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		// incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		// pantalla.

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.printf("El numero del for es igual a %d\n", numeroFor);
		}

		// Por último, para el Switch, deberás crear la variable estacion, y distintos
		// case para las cuatro estaciones del año. Dependiendo del valor de la variable
		// estacion se deberá mandar un mensaje por consola informando de la estación en
		// la que está. También habrá que poner un default para cuando el valor de la
		// variable no sea una estación.
		
		switch(estacion.toLowerCase()) {
		case "primavera":
			System.out.println("Estamos en primavera");
			break;
		case "verano":
			System.out.println("Estamos en verano");
			break;
		case "otoño":
			System.out.println("Estamos en otoño");
			break;
		case "invierno":
			System.out.println("Estamos en invierno");
			break;
		default:
			System.out.println("El valor no corresponde a ninguna estación del año");
		}
		
	}

}
