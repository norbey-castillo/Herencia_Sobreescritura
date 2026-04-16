package HerenciaYSobreescritura;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}



	public void mostrar() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	/*Aca esta el metodo principal que me muestra el nombre y la edad de la clase persona
	 * no se tiene problema a la hora de mostrae porque no conflictua con los demas metodos
	 * sobreescritos. s*/

}
