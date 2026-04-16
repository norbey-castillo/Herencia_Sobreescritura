package HerenciaYSobreescritura;

public class Estudiante extends Persona{
	
	private String carnet;

	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	
	@Override
	public void mostrar() {
		System.out.println("\ntu nombre es: " + getNombre());
		System.out.println("tu edad es: " + getEdad());
		System.out.println("tu carnet es: "+ carnet);
	}
	/*Aca aplique la sobreescritura para en general poder modificar un poco
	 * la forma en que se imprimen los datos del estudiante en la consola
	 * entonces aca solo se muestran los datos del estudiante, no mas. */
	

}
