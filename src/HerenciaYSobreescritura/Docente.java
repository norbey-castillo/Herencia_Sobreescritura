package HerenciaYSobreescritura;

public class Docente extends Persona{
	
	private String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	@Override
	public void mostrar() {
		System.out.println("\nSu docente es: " + getNombre());
		System.out.println("Su edad es: " + getEdad());
		System.out.println("Su especialidad es: " + especialidad);
	}
	
	
	

}
