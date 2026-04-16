package HerenciaYSobreescritura;

public class Transporte {
	private int capacidad;

	public Transporte(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public void Descripcion() {
		System.out.println("\tEl transporte es: \nGrande \nCon varios asientos \nVeloz \n");
		
	}

}
