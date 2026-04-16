package HerenciaYSobreescritura;

public class main {

	public static void main(String[] args) {
		Libro l1 = new Libro("EL nombre del viento", "Osvin");
		LibroDigital ld1 = new LibroDigital("EL nombre del viento 2", "Osvin", 500);
		
		l1.mostrarInfo();
		ld1.mostrarInfo();
	}
}
