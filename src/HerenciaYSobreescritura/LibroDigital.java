package HerenciaYSobreescritura;

public class LibroDigital extends Libro{
	private int tamaño_en_MB;

	public LibroDigital(String titulo, String autor, int tamaño_en_MB) {
		super(titulo, autor);
		this.tamaño_en_MB = tamaño_en_MB;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("\nEl titulo del libro es: "+getTitulo());
		System.out.println("El nombre del autor es: "+getAutor());
		System.out.println("El tamaño en MB es: "+tamaño_en_MB);

	}

	

}
