package ejerciciosTema3;

public class Coche {

	static int puertas;
	
	public static void anyadirPuertas (int cantidad) {
		puertas+=cantidad;
	}
	
	public static void main(String[] args) {
		anyadirPuertas(4);
		System.out.printf("Este coche tiene %d puertas",puertas);
	}
	
}
